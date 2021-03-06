$(document).ready(function () {
    $('#userinfo').bootstrapTable('resetView');
    // purchasequery();
    queryinfolist();
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



// 查询
function queryinfolist(getparam){
    $.ajax({
        type:"POST",
        url:'/searchuserinfo',
        contentType: 'application/json',
        async: false,
        data:JSON.stringify({quickSearch : getparam}),
        success:function(data){
            //  var dataJson = eval('(' + data.data + ')');
            //  console.log(data.data);
            var datalist = data.data;
            $('#userinfo').bootstrapTable('destroy').bootstrapTable('resetView').bootstrapTable({    //'destroy' 是必须要加的==作用是加载服务器//    //数据，初始化表格的内容Destroy the bootstrap table.
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
                        field: 'username',
                        title: '用户名',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                    }, {
                        field: 'personname',
                        title: '姓名',
                        halign: 'center',
                        align: 'center',
                        visible: true,
                        sortable: true
                        // formatter: statusFormatter
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
                            return "<a href=\"javascript:editshow('"+row.uid+"')\">编辑</a>";
                        }
                    },]

            });

        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,1500);
        }

    });
}

// 新增
function saveuserinfo(){
    var addusername=$("#addusername").val();
    var addpassword=$("#addpassword").val();
    var addpersonname=$("#addpersonname").val();
    $.ajax({
        type:"POST",
        url:'/adduserinfo',
        contentType: 'application/json',
        data:JSON.stringify({username :addusername,password:addpassword,personname:addpersonname}),
        success:function(data){
            $('#inventoryadd').modal('hide')
            ZENG.msgbox.show("保存成功！", 4,1500);
            queryinfolist();
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


function editshow(getid) {
    $.ajax({
        type:"POST",
        url:'/searchuserinfo',
        contentType: 'application/json',
        data:JSON.stringify({quickSearch : getid}),
        success:function(data){
            $("#edituid").val(getid);
            $("#editusername").val(data.data[0].username);
            $("#editpersonname").val(data.data[0].personname);
            $('#edituser').modal('show')
        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,2000);
        }

    });
}

//  编辑保存
function editinfo() {
    var editusername=$("#editusername").val();
    var editpersonname=$("#editpersonname").val();
    var editpassword=$("#editpassword").val();
    var edituid=$("#edituid").val();

    $.ajax({
        type:"POST",
        url:'/edituserinfo',
        contentType: 'application/json',
        data:JSON.stringify({uid:edituid,username:editusername,personname :editpersonname,password:editpassword}),
        success:function(data){
            $('#edituser').modal('hide');
            ZENG.msgbox.show("编辑成功！", 4,1500);
            queryinfolist();
            // console.log(data);
        },error:function(data){
            ZENG.msgbox.show("服务器异常！", 5,2000);
        }

    });
}
