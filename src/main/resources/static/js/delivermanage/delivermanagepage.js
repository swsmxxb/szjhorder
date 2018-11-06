$(document).ready(function () {
    $('#purchaseinfo').bootstrapTable('resetView');
   // purchasequery();
    Bindselected("#adddrwno","search");
    queryinfo();
});
$("#addsendtime").datetimepicker({  // 日期框
    format: "yyyy-mm-dd",
    autoclose: true,
    todayBtn: true,
    language: "zh-CN",
    pickerPosition: "bottom-left",
    startView :2,
    minView :2
});

function dosearch(){
     var getkeyword=$('#orderkeyword').val();
     console.log(getkeyword);
    queryinfo(getkeyword);
}

// 删除按钮
function  delinfo() {
    ZENG.msgbox.show("删除", 1,1500);
}

function editinfo(getid) {
    $('#orderedit').modal('show');
   // console.log(getid);
    $("#editid").val(getid);

}

function uploadpic(getid) {
    // ZENG.msgbox.show("打印"+getid, 1,1500);
    // $.ajax({
    //     type:"POST",
    //     url:'/searchpurchase',
    //     contentType: 'application/json',
    //     async: false,
    //     data:JSON.stringify({quickSearch : getid}),
    //     success:function(data){
    //         ZENG.msgbox.show("图片上传！", 4,1500);
    //
    //     },
    //     error:function(data){
    //         ZENG.msgbox.show("服务器异常！", 5,1500);
    //     }
    //
    // });

}


// 查询
function queryinfo(getparam){
    $.ajax({
        type:"POST",
        url:'/searchpurchaseorderh',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : getparam}),
        success:function(data){
         //  var dataJson = eval('(' + data.data + ')');
          //  console.log(data.data);
            var datalist = data.data;
            $('#purchaseinfo').bootstrapTable('destroy').bootstrapTable('resetView').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
                data:datalist,     //datalist  即为需要的数据
                dataType:'json',
                // data_locale:"zh-US",    //转换中文 但是没有什么用处
                pagination: true,
                pageSize: 10,
                pageList:[10, 20, 50, 100, 200],
                pageNumber:1,
                paginationLoop:false,
                sortable:true,
                pagination: true, // 是否显示分页（*）
                //这里也可以将TABLE样式中的<tr>标签里的内容挪到这里面：
                columns: [
                    {
                        title: '选择',
                        field: 'select',
                        checkbox: true,
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'id',
                        title: 'NO.',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        formatter: function statusFormatter(value, row, index){
                            return index+1;
                        }
                    }, {
                        field: 'orderno',
                        title: '采购单号',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'suppliershotname',
                        title: '供应商',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'sendtime',
                        title: '交货日期',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                        // formatter: statusFormatter
                    }, {
                        field: 'status',
                        title: '状态',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true,
                        formatter: function statusFormatter(value, row, index){
                            var returninfo;
                            if (row.status="1") {
                                returninfo="未验收"
                            }
                          else  if (row.status="2") {
                                returninfo="验收OK"
                            }
                            else  if (row.status="3") {
                                returninfo="验收NG"
                            }
                            return returninfo;
                        }
                    },{
                        field: 'opation',
                        title: '操作',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        formatter: function statusFormatter(value, row, index){
                            return "<a href=\"javascript:editinfo('"+row.hid+"')\">验收</a> | <a href=\"javascript:uploadpic('"+row.id+"')\">上传</a>";
                        }
                    },]

            });

        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });
}

// 编辑
function saveorderlist(){
    var hid=$("#editid").val();
    var status=$("#editstatus").val();
    var problemtype=$("#editproblemtype").val();
      console.log(hid);
    $.ajax({
        type:"POST",
        url:'/editpurchase',
        contentType: 'application/json',
        data:JSON.stringify({hid :hid,status:status,problemtype:problemtype}),
        success:function(data){
            $('#orderedit').modal('hide');
            ZENG.msgbox.show("保存成功！", 4,1500);
            queryinfo();
            // console.log(data);
        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    })

 }

 // 下拉框绑定
function Bindselected(selector,entry) {
    $.ajax({
        url: "/searchInventory",
        type: "POST",
        async: false,
        contentType: 'application/json',
        data:JSON.stringify({quickSearch : ""}),
        success: function (data) {
            var operationName = $(selector);
            operationName.empty();
            if(entry=="search"){
                operationName.append("<option value=''>请选择</option>");
            }
            for (var i = 0; i < data.data.length; i++) {
                operationName.append("<option value='" + data.data[i].id + "'>" + data.data[i].inventorycode + "</option>");
            }
            $(selector).selectpicker('refresh');
        },
        error: function (event, XMLHttpRequest, ajaxOptions, thrownError) {
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }
    })
          }

$('#editstatus').change(function(){
   var getvalue=$('#editstatus').val();
   if (getvalue=="3") {
       $('#divproblemtype').css('display','block');
   }
   else if (getvalue=="2") {
       $('#divproblemtype').css('display','none');
   }


});
