package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.PurchaseorderH;
import com.szjc.OrderManag.bean.PurchaseorderHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseorderHMapper {
    long countByExample(PurchaseorderHExample example);

    int deleteByExample(PurchaseorderHExample example);

    int deleteByPrimaryKey(String hid);

    int insert(PurchaseorderH record);

    int insertSelective(PurchaseorderH record);

    List<PurchaseorderH> selectByExample(PurchaseorderHExample example);

    PurchaseorderH selectByPrimaryKey(String hid);

    int updateByExampleSelective(@Param("record") PurchaseorderH record, @Param("example") PurchaseorderHExample example);

    int updateByExample(@Param("record") PurchaseorderH record, @Param("example") PurchaseorderHExample example);

    int updateByPrimaryKeySelective(PurchaseorderH record);

    int updateByPrimaryKey(PurchaseorderH record);

    List<PurchaseorderH> searchpurchaseorderh(@Param("quickSearch") String quickSearch);
}