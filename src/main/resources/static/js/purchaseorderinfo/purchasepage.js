$(document).ready(function () {

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
    ZENG.msgbox.show("删除", 1,2000);
}

function purchaselist(){
    $.ajax({
        type:"POST",
        url:'/searchpurchase',
        contentType: 'application/json',
        data:JSON.stringify({quickSearch : ""}),
        success:function(data){
         //  var dataJson = eval('(' + data.data + ')');
            console.log(data.data);
            var datalist = data.data;
            $('#purchaseinfo').bootstrapTable('destroy').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
                data:datalist,     //datalist  即为需要的数据
                dataType:'json',
                // data_locale:"zh-US",    //转换中文 但是没有什么用处
                pagination: true,
                pageList:[],
                pageNumber:1,
                pageSize:5,//每页显示的数量
                paginationLoop:false,
                //这里也可以将TABLE样式中的<tr>标签里的内容挪到这里面：
                columns: [
                    {
                        title: '选择',
                        field: 'select',
                        checkbox: true,
                        align: 'center',
                        valign: 'middle',
                        sortable: true
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
                        field: 'price',
                        title: '名称',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'price',
                        title: '备注',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                        // formatter: statusFormatter
                    }]

            });

        },error:function(data){
            Modal.confirm({title:'提示',msg:"刷新数据失败!"});
        }

    })
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
            ZENG.msgbox.show("保存成功！", 4,2000);
            console.log(data);
        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,2000);
        }

    })

 }


function purchasequery() {  //工艺参数查询

    var cols = [
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
            field: 'price',
            title: '名称',
            halign: 'center',
            align: 'center',
            visible: true,
            sortable: true
        }, {
            field: 'price',
            title: '备注',
            halign: 'center',
            align: 'center',
            visible: true,
            sortable: true
            // formatter: statusFormatter
        }];
    TableDataBind("#purchaseinfo",
        "/searchpurchase", cols);   //执行查询的函数
    $("#purchaseinfo").bootstrapTable('destroy');
}


function TableDataBind(selector, url, columns) {
    $(selector).bootstrapTable({
        url: url,
        method: 'POST',
        contentType: 'application/json',
        dataType: 'json',
        async: false,
        queryParams : function(params) {
            return JSON.stringify({
                // 说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值
                pageSize : params.pageSize,
                pageNumber : params.pageNumber,
                quickSearch : "123"
            });
        },
        columns:columns
    });
}