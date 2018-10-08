package com.szjc.OrderManag.service.baseinfo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseorderHService<PurchaseorderH, PurchaseorderHExample> {
    long countByExample(com.szjc.OrderManag.bean.PurchaseorderHExample example);

    int deleteByExample(com.szjc.OrderManag.bean.PurchaseorderHExample example);

    int deleteByPrimaryKey(String hid);

    int insert(com.szjc.OrderManag.bean.PurchaseorderH record);

    int insertSelective(com.szjc.OrderManag.bean.PurchaseorderH record);

    List<com.szjc.OrderManag.bean.PurchaseorderH> selectByExample(com.szjc.OrderManag.bean.PurchaseorderHExample example);

    com.szjc.OrderManag.bean.PurchaseorderH selectByPrimaryKey(String hid);

    int updateByExampleSelective(@Param("record") com.szjc.OrderManag.bean.PurchaseorderH record, @Param("example") com.szjc.OrderManag.bean.PurchaseorderHExample example);

    int updateByExample(@Param("record") com.szjc.OrderManag.bean.PurchaseorderH record, @Param("example") com.szjc.OrderManag.bean.PurchaseorderHExample example);

    int updateByPrimaryKeySelective(com.szjc.OrderManag.bean.PurchaseorderH record);

    int updateByPrimaryKey(com.szjc.OrderManag.bean.PurchaseorderH record);

    List<com.szjc.OrderManag.bean.PurchaseorderH> searchpurchaseorderh(@Param("quickSearch") String quickSearch);

}
