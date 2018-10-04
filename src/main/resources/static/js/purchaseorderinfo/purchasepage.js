$(document).ready(function () {
    $('#purchaseinfo').bootstrapTable('resetView');
   // purchasequery();
    purchaselist();
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

// 删除按钮
function  delinfo() {
    ZENG.msgbox.show("删除", 1,1500);
}

function editinfo(getid) {
    ZENG.msgbox.show(getid, 1,1500);
}

function printinfo(getid) {
    // ZENG.msgbox.show("打印"+getid, 1,1500);
    $.ajax({
        type:"POST",
        url:'/searchpurchase',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : getid}),
        success:function(data){
          //  console.log(data.data[0].orderno);
            $('#porder').text(data.data[0].orderno);
            $('#psendtime').text(data.data[0].sendtime);
            $('#pinventoryname').text(data.data[0].inventoryname);
            $('#pnum').text(data.data[0].num);
            $('#pspeci').text(data.data[0].speci);
            $('#pcolor').text(data.data[0].color);
            $('#pdrwno').attr("src", '/img/orderlogo.png');
            $('#pcreattaime').text(data.data[0].creattaime);
            $("#printdatastati").attr("style","display:block;");
            $("#printdatastati").printArea();
            $("#printdatastati").attr("style","display:none;");
        },
        error:function(data){
            Modal.confirm({title:'提示',msg:"刷新数据失败!"});
        }

    });

}


// 查询
function purchaselist(){
    $.ajax({
        type:"POST",
        url:'/searchpurchase',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : ""}),
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
                        title: '订单号',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'drwno',
                        title: '图纸号',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'inventoryname',
                        title: '品名',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                        // formatter: statusFormatter
                    }, {
                        field: 'num',
                        title: '数量',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'color',
                        title: '颜色',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'speci',
                        title: '规格',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    },{
                        field: 'opation',
                        title: '操作',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        formatter: function statusFormatter(value, row, index){
                            return "<a href=\"javascript:editinfo('"+row.id+"')\">编辑</a> | <a href=\"javascript:printinfo('"+row.id+"')\">打印</a>";
                        }
                    },]

            });

        },error:function(data){
            Modal.confirm({title:'提示',msg:"刷新数据失败!"});
        }

    });
}

// 新增
function saveorderlist(){
    var addorderno=$("#addorderno").val();
    var adddrwno=$("#adddrwno").val();
    var addspeci=$("#addspeci").val();
    var addcolor=$("#addcolor").val();
    var addnum=$("#addnum").val();
    var addsendtime=$("#addsendtime").val();
      console.log(addsendtime);
    $.ajax({
        type:"POST",
        url:'/addpurchase',
        contentType: 'application/json',
        data:JSON.stringify({orderno :addorderno,drwno:adddrwno,speci:addspeci,color:addcolor,num:addnum,sendtime:addsendtime}),
        success:function(data){
            $('#orderedit').modal('hide')
            ZENG.msgbox.show("保存成功！", 4,1500);
            purchaselist();
            // console.log(data);
        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,2000);
        }

    })

 }

function BindWorkShop(selector,entry) {
    $.ajax({
        url: _ctx+"/processManagement/queryListByParameterType.do",
        type: "POST",
        async: false,
        data : {parametertype:"workshop"},
        dataType: "JSON",
        ContentType: "application/json",
        success: function (data) {
            var operationName = $(selector);
            operationName.empty();
            if(entry=="search"){
                operationName.append("<option value=''>请选择</option>");
            }
            for (var i = 0; i < data.length; i++) {
                operationName.append("<option value='" + data[i].parameterid + "'>" + data[i].parametername + "</option>");
            }
            $(selector).selectpicker('refresh');
        },
        error: function (event, XMLHttpRequest, ajaxOptions, thrownError) {
            alert(event);
        }
    })
          }


// function purchasequery() {  //工艺参数查询
//
//     var cols = [
//         {
//             title: '选择',
//             field: 'select',
//             checkbox: true,
//             align: 'center',
//             valign: 'middle'
//
//         }, {
//             field: 'id',
//             title: 'NO.',
//             halign: 'center',
//             align: 'center',
//             visible: true,
//             formatter: function statusFormatter(value, row, index){
//                 return index+1;
//             }
//         }, {
//             field: 'orderno',
//             title: '订单号',
//             halign: 'center',
//             align: 'center',
//             visible: true,
//             sortable: true
//         }, {
//             field: 'price',
//             title: '名称',
//             halign: 'center',
//             align: 'center',
//             visible: true,
//             sortable: true
//         }, {
//             field: 'price',
//             title: '备注',
//             halign: 'center',
//             align: 'center',
//             visible: true,
//             sortable: true
//             // formatter: statusFormatter
//         }];
//     TableDataBind("#purchaseinfo",
//         "/searchpurchase", cols);   //执行查询的函数
//     $("#purchaseinfo").bootstrapTable('destroy');
// }


// function TableDataBind(selector, url, columns) {
//     $(selector).bootstrapTable({
//         url: url,
//         method: 'POST',
//         contentType: 'application/json',
//         dataType: 'json',
//         async: false,
//         queryParams : function(params) {
//             return JSON.stringify({
//                 // 说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值
//                 pageSize : params.pageSize,
//                 pageNumber : params.pageNumber,
//                 quickSearch : "123"
//             });
//         },
//         columns:columns
//     });
// }