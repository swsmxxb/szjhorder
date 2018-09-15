$(document).ready(function () {

    supplierquery();
});


function supplierquery() {  //工艺参数查询

    var cols = [[
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
            sortable: true
        }, {
            field: 'name',
            title: '编码',
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
        }]]
    TableDataBind("#supplierinfo",
        "js/demo/bootstrap_table_test.json", cols,
        "queryParams", "cinvtype", true, false, false);   //执行查询的函数
    $("#detaildataList").bootstrapTable('destroy');
}


function TableDataBind(selector, url, columns, queryParams, uniqueId, pagination,showColumns,showExport) {
    $(selector).bootstrapTable({
        url: url,
        search: true,
        pagination: true,
        showRefresh: true,
        showToggle: true,
        showColumns: true,
        iconSize: 'outline',
        columns: columns,
        //toolbar: '#exampleTableEventsToolbar',
        icons: {
            refresh: 'glyphicon-repeat',
            toggle: 'glyphicon-list-alt',
            columns: 'glyphicon-list'
        }
    });
}