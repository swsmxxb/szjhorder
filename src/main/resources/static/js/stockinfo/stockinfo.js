var inventroylist;

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

function Bindselected() {
    $.ajax({
        url: "/searchInventory",
        type: "POST",
        async: false,
        contentType: 'application/json',
        data:JSON.stringify({quickSearch : ""}),
        success: function (data) {
            inventroylist=data.data;
            // console.log(inventroylist)
        },
        error: function (event, XMLHttpRequest, ajaxOptions, thrownError) {
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }
    })
}


function equipCodeBind(selector) {
    // idcount = 0;
    var data = inventroylist;
    var operationName = $(selector);
    operationName.empty();
    operationName.append("<option value=''>请选择</option>");
    for (var i = 0; i < data.length; i++) {
        operationName.append("<option value='" + data[i].id + "'>" + data[i].inventorycode + "</option>");
    }
    $(selector).selectpicker('refresh');
}

function dosearch(){
    var getkeyword=$('#orderkeyword').val();
    console.log(getkeyword);
    queryinfo(getkeyword);
}

function doreset(){
    $('#orderkeyword').val("");
    var getkeyword="";
    // console.log(getkeyword);
    queryinfo(getkeyword);
}

// 查询流水
function queryinfo(getparam){
    $.ajax({
        type:"POST",
        url:'/searchstockinfo',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : getparam}),
        success:function(data){
            //  var dataJson = eval('(' + data.data + ')');
            //  console.log(data.data);
            var datalist = data.data;
            $('#stockinfo').bootstrapTable('destroy').bootstrapTable('resetView').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
                data:datalist,     //datalist  即为需要的数据
                dataType:'json',
                // data_locale:"zh-US",    //转换中文 但是没有什么用处
                pagination: true,
                pageSize: 20,
                pageList:[20, 50, 100, 200],
                pageNumber:1,
                paginationLoop:false,
                sortable:true,
                pagination: true, // 是否显示分页（*）
                height: $(window).height()-275,
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
                        sortable: true,
                        formatter: function statusFormatter(value, row, index){
                            return "<a href=\"javascript:showdetail('"+value+"')\">"+value+"</a>";
                        }
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
                        field: 'types',
                        title: '类型',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true,
                        formatter: function statusFormatter(value, row, index){
                             var rtypes;
                            if (value=="1") {
                                rtypes="<span style=\"color:#23AD44;font-weight: bold\">入库</span>";
                            }
                            else if  (value=="2") {
                                rtypes="<span style=\"color:#6254B2;font-weight: bold\">出库</span>";
                            }
                            else if  (value=="3") {
                                rtypes="<span style=\"color:#19A9D5;font-weight: bold\">返库</span>";
                            }
                            return rtypes;
                        }
                    }
                    ,{
                        field: 'nums',
                        title: '数量',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    },{
                        field: 'personname',
                        title: '操作人',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    },{
                        field: 'creattime',
                        title: '时间',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    },

                    // {
                    //     field: 'opation',
                    //     title: '操作',
                    //     halign: 'center',
                    //     align: 'center',
                    //     visible: true,
                    //     formatter: function statusFormatter(value, row, index){
                    //         return "<a href=\"javascript:editshow('"+row.id+"')\">编辑</a> | <a href=\"javascript:stockin('"+row.id+"')\">入库</a> " +
                    //             "| <a href=\"javascript:stockout('"+row.id+"')\">出库</a> | <a href=\"javascript:stockreturn('"+row.id+"')\">返库</a>";
                    //     }
                    // },
                ]

            });

        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });
}

// 查询统计
function querystatusinfo(getparam){
    $.ajax({
        type:"POST",
        url:'/searchStockstatus',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : getparam}),
        success:function(data){
            //  var dataJson = eval('(' + data.data + ')');
            //  console.log(data.data);
            var datalist = data.data;
            $('#stockstatusinfo').bootstrapTable('destroy').bootstrapTable('resetView').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
                data:datalist,     //datalist  即为需要的数据
                dataType:'json',
                // data_locale:"zh-US",    //转换中文 但是没有什么用处
                pagination: true,
                pageSize: 20,
                pageList:[20, 50, 100, 200],
                pageNumber:1,
                paginationLoop:false,
                sortable:true,
                pagination: true, // 是否显示分页（*）
                height: $(window).height()-275,
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
                    }
                    ,{
                        field: 'nums',
                        title: '数量',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }]

            });

        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });
}

function stockopation(gettype) {

    if (gettype=="1") {
        $('#cardtitle').html("入库");
    }
    else if  (gettype=="2") {
        $('#cardtitle').html("出库");
    }
    else if  (gettype=="3") {
        $('#cardtitle').html("返库");
    }
    equipCodeBind("#addinventoryid");
    $("#stockopation").modal('show')
}

// 新增
function saveinventorylist(){
    var addinventorycode=$("#addinventorycode").val();
    var addinventoryname=$("#addinventoryname").val();
    var addspeci=$("#addspeci").val();
    var addcolor=$("#addcolor").val();
    var addmaterial=$("#addmaterial").val();
    $.ajax({
        type:"POST",
        url:'/addstockinfo',
        contentType: 'application/json',
        data:JSON.stringify({inventorycode :addinventorycode,inventoryname:addinventoryname,speci:addspeci,color:addcolor,material:addmaterial}),
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