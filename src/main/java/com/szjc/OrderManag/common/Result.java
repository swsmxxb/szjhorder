package com.szjc.OrderManag.common;

import java.util.Map;

public class Result {
    String code;
    String message;
    Object data;
    Map table;

    public Map getTable(){
        return this.table;
    }

    public void setTable(Map table) {
        this.table = table;
    }

//    public static <T> Result SearchResult(List<T> data){
//        Map<String, Object> map = new HashMap<>();
//        PageInfo<T> pageInfo = new PageInfo<T>(data);
//        map.put("rows", data); // 分页列表
//        map.put("total", pageInfo.getTotal());
//        return new Result("0", "请求成功", map, map);
//    }

    public static Result successResult(Object Data)
    {
        return new Result("0", "请求成功", Data);
    }

    public static Result errorResultWms(Integer Code,String message)
    {
        return new Result(Code.toString(), message, null);
    }

    public Result(String code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String code, String message, Object data, Map table){
        this.code = code;
        this.message = message;
        this.data = data;
        this.table = table;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
