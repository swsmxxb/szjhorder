var idcount;
var inventroylist;
$(document).ready(function () {
    $('#purchaseinfo').bootstrapTable('resetView');
   // purchasequery();
    Bindselected();
    Bindselected2("#addcustommanag","search");

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

function dosearch(){
    var getkeyword=$('#orderkeyword').val();
    console.log(getkeyword);
    purchaselist(getkeyword);
}

function doreset(){
    $('#orderkeyword').val("");
    var getkeyword="";
    // console.log(getkeyword);
    inventroyinfolist(getkeyword);
}

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
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });

}


// 查询
function purchaselist(getparam){
    $.ajax({
        type:"POST",
        url:'/searchpurchase',
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
                detailView: true,
                onExpandRow: onExpandRow,  //主子表绑定
                pagination: true, // 是否显示分页（*）
                height:$(window).height() - 275,
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
                        field: 'custommanag',
                        title: '客户担当',
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
                        sortable: true
                    }, {
                        field: 'creattime',
                        title: '创建日期',
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
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });
}

// 父子表
function onExpandRow(index, row, $detail) {
    InitSubTable(index, row, $detail);
}

InitSubTable = function (index, row, $detail) {

    var cur_table = $detail.html('<table></table>').find('table');
    $.ajax({
        type:"POST",
        url:'/searchorderb',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({hid : row.hid}),
        success:function(data){
            //  var dataJson = eval('(' + data.data + ')');
            //  console.log(data.data);
            var datalist = data.data;
            $(cur_table).bootstrapTable('destroy').bootstrapTable('resetView').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
                data:datalist,     //datalist  即为需要的数据
                dataType:'json',
                // data_locale:"zh-US",    //转换中文 但是没有什么用处
                pagination: true,
                pageSize: 10,
                pageList:[10, 20, 50, 100, 200],
                pageNumber:1,
                paginationLoop:false,
                sortable:true,
                detailView: true,
                onExpandRow: onExpandRow,  //主子表绑定
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
                    }]

            });

        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });

};
// 新增
function saveorderlist(){
    var addorderno=$("#addorderno").val();
    var addcustommanag=$("#addcustommanag").val();
    var addsendtime=$("#addsendtime").val();
      console.log(addsendtime);
    $.ajax({
        type:"POST",
        url:'/addpurchase',
        contentType: 'application/json',
        data:JSON.stringify({orderno :addorderno,custommanag:addcustommanag,sendtime:addsendtime}),
        success:function(data){
            $('#orderadd').modal('hide');
            ZENG.msgbox.show("保存成功！", 4,1500);
            purchaselist();
            // console.log(data);
        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    })

 }

 // 下拉框绑定
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

function Bindselected2(selector,entry) {
    $.ajax({
        url: "/searchuserinfo",
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
                operationName.append("<option value='" + data.data[i].uid + "'>" + data.data[i].personname + "</option>");
            }
            $(selector).selectpicker('refresh');
        },
        error: function (event, XMLHttpRequest, ajaxOptions, thrownError) {
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }
    })
}


$('#adddrwno').change(function(){
    $.ajax({
        url: "/searchInventory",
        type: "POST",
        async: false,
        contentType: 'application/json',
        data:JSON.stringify({quickSearch : $("#adddrwno").val()}),
        success: function (data) {
            $("#addspeci").val(data.data[0].speci);
        },
        error: function (event, XMLHttpRequest, ajaxOptions, thrownError) {
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }
    })

});

function eddevent() {
    idcount = 0;
    $("#para_table").text("");
    // $("#para_table").empty();
    var pi = $(
        "<tr>\n" +
        "                        <th style=\"text-align:center\" width=\"100\">序号</th>\n" +
        "                        <th style=\"text-align:center\" width=\"200\">图纸号</th>\n" +
        "                        <th style=\"text-align:center\" width=\"200\">规格</th>\n" +
        "                        <th style=\"text-align:center\" width=\"200\">颜色</th>\n" +
        "                        <th style=\"text-align:center\" width=\"200\">用料</th>\n" +
        "                        <th style=\"text-align:center\" width=\"200\">采购数量</th>\n" +
        "                        <th style=\"text-align:center\" width=\"80\">编辑</th>\n" +
        "                    </tr>\n"
        +
        "                    <tr>\n" +
        "                        <td id=\"a0\" style=\"text-align:center; \" >1</td>\n" +
        "                        <td id=\"b0\" style=\"text-align:center; \" >" + "<select id=\"bs0\" class=\"form-control selectpicker\" data-live-search=\"true\" required></select>" + "</td>\n" +
        "                        <td id=\"c0\" style=\"text-align:center; \" ></td>\n" +
        "                        <td id=\"f0\" style=\"text-align:center; \" ></td>\n" +
        "                        <td id=\"g0\" style=\"text-align:center; \" ></td>\n" +
        "                        <td id=\"d0\" style=\"text-align:center; \" onclick=\"tdclick(this)\"></td>\n" +
        "                        <td id=\"e0\"  style=\"text-align:center; \" onclick=\"deletetr(this)\">\n" +
        "                            <button type=\"button\"  class=\"btn btn-xs btn-link\">删除</button>\n" +
        "                        </td>\n" +
        "                    </tr>"
    );

    $("#para_table").append(pi);
    equipCodeBind("#bs0");
    $("#bs0").change(function () {
        //alert($("#bs0").val());
        var id = $("#bs0").val();
        for (var j = 0; j < inventroylist.length; j++) {
            if (inventroylist[j].id == id) {
                $("#c0").text(inventroylist[j].speci);
                $("#f0").text(inventroylist[j].color);
                $("#g0").text(inventroylist[j].material);
                return;
            }
        }
    });
    $("#orderadd").modal('show');
}

// 对于增加的列的绑定
function chooseName(object) {
    var s = $(object);
    var index = object.id.charAt(object.id.length-1)
    var id = s.val();
    for (var j = 0; j < inventroylist.length; j++) {
        if (inventroylist[j].id == id) {
            $("#c"+ index).text(inventroylist[j].speci);
            $("#f"+ index).text(inventroylist[j].color);
            $("#g"+ index).text(inventroylist[j].material);
            return;
        }
    }
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


function addtr() {
    console.log("add1:"+idcount)
    idcount = idcount + 1;
    console.log("add2:"+idcount)
    var table = $("#para_table");
    var tr = $("<tr>" +
        "<td id='a" + idcount + "' align='center' >" + "1</td>" +
        "<td id='b" + idcount + "' align='center'>" + "<select id='bs" + idcount + "' onchange='chooseName(this)' class='form-control selectpicker' data-live-search='true' required></select>" + "</td>" +
        "<td id='c" + idcount + "' align='center'>" + "</td>" +
        "<td id='f" + idcount + "' align='center'>" + "</td>" +
        "<td id='g" + idcount + "' align='center'>" + "</td>" +
        "<td id='d" + idcount + "' align='center' onclick='tdclick(this)'>" + "</td>" +
        "<td id='e" + idcount + "' align='center' onclick='deletetr(this)'><button type='button'  class='btn btn-xs btn-link' >" + "删除" + "</button></td></tr>");
    table.append(tr);
    equipCodeBind("#bs" + idcount);
    //alert($("#bs2"));
    console.log("add3:"+idcount)
    var j = 1;
    for (i = 0; i <= idcount; i++) {
        //alert($("#a"+i));
        if ($("#a" + i).text() != "") {
            $("#a" + i).text(j);
            j++;
        }
    }
}


// 自添项的绑定
function tdclick(tdobject) {
    var td = $(tdobject);
    td.attr("onclick", "");
    //1,取出当前td中的文本内容保存起来
    var text = td.text();
    //2,清空td里面的内容
    td.html(""); //也可以用td.empty();
    //3，建立一个文本框，也就是input的元素节点
    var input = $("<input>");
    //4，设置文本框的值是保存起来的文本内容
    input.attr("value", text);
    input.attr("type","number");
    input.attr("style","width: 100px;");
    input.bind("blur", function () {
        var inputnode = $(this);
        var inputtext = inputnode.val();
        var tdNode = inputnode.parent();
        tdNode.html(inputtext);
        tdNode.click(tdclick);
        td.attr("onclick", "tdclick(this)");
    });
    input.keyup(function (event) {
        var myEvent = event || window.event;
        var kcode = myEvent.keyCode;
        if (kcode == 13) {
            var inputnode = $(this);
            var inputtext = inputnode.val();
            var tdNode = inputnode.parent();
            tdNode.html(inputtext);
            tdNode.click(tdclick);
        }
    });
    //5，将文本框加入到td中
    td.append(input);
    var t = input.val();
    input.val("").focus().val(t);
//              input.focus();
    //6,清除点击事件
    td.unbind("click");
}
// 删除行
function deletetr(tdobject) {

    var td = $(tdobject);
    td.parents("tr").remove();
    var j = 1;
    var trcount=$("#para_table tbody").children('tr').length-2;
    console.log(trcount)
    for (i = 0; i <= idcount; i++) {

        //alert($("#a"+i));
        if ($("#a" + i).text() != "") {
            $("#a" + i).text(j);
            j++;
        }
    }

}
