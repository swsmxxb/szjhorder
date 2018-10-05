$(document).ready(function () {
    $('#purchaseinfo').bootstrapTable('resetView');
    // purchasequery();
    inventroyinfolist();
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


// 查询
function inventroyinfolist(){
    $.ajax({
        type:"POST",
        url:'/searchInventory',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : ""}),
        success:function(data){
            //  var dataJson = eval('(' + data.data + ')');
            //  console.log(data.data);
            var datalist = data.data;
            $('#inventoryinfo').bootstrapTable('destroy').bootstrapTable('resetView').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
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
                        field: 'id',
                        title: 'NO.',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        formatter: function statusFormatter(value, row, index){
                            return index+1;
                        }
                    }, {
                        field: 'inventorycode',
                        title: '编码',
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
                    },{
                        field: 'speci',
                        title: '规格',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    },{
                        field: 'creattime',
                        title: '创建时间',
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
                            return "<a href=\"javascript:editinfo('"+row.id+"')\">编辑</a>";
                        }
                    },]

            });

        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });
}

// 新增
function saveinventorylist(){
    var addinventorycode=$("#addinventorycode").val();
    var addinventoryname=$("#addinventoryname").val();
    var addspeci=$("#addspeci").val();
    $.ajax({
        type:"POST",
        url:'/addinventoryinfo',
        contentType: 'application/json',
        data:JSON.stringify({inventorycode :addinventorycode,inventoryname:addinventoryname,speci:addspeci}),
        success:function(data){
            $('#inventoryadd').modal('hide')
            ZENG.msgbox.show("保存成功！", 4,1500);
            inventroyinfolist();
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

//绑定选中值 pet/pps
function BindProductClassSelected(selector,values)
{
    $.ajax({
        url: _ctx+"/workshopManagement/queryListByParameterType.do",
        type: "POST",
        async: false,
        dataType: "JSON",
        data : {parametertype:"producttype"},
        ContentType: "application/json",
        success: function (data) {
            var operationName = $(selector);
            operationName.empty();
            operationName.append("<option value=''>请选择</option>");
            for (var i = 0; i < data.length; i++) {
                if(values== data[i].parametername){
                    operationName.append("<option value='" + data[i].parameterid + "' selected='selected'>" + data[i].parametername+ "</option>");
                }else{
                    operationName.append("<option value='" + data[i].parameterid + "' >" +data[i].parametername+ "</option>");
                }

            }
            $(selector).selectpicker('refresh');
        },
        error: function (event, XMLHttpRequest, ajaxOptions, thrownError) {
            alert(event);
        }
    })
}
