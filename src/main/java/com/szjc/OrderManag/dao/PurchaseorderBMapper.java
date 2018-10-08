package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.PurchaseorderB;
import com.szjc.OrderManag.bean.PurchaseorderBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseorderBMapper {
    long countByExample(PurchaseorderBExample example);

    int deleteByExample(PurchaseorderBExample example);

    int deleteByPrimaryKey(String bid);

    int insert(PurchaseorderB record);

    int insertSelective(PurchaseorderB record);

    List<PurchaseorderB> selectByExample(PurchaseorderBExample example);

    PurchaseorderB selectByPrimaryKey(String bid);

    int updateByExampleSelective(@Param("record") PurchaseorderB record, @Param("example") PurchaseorderBExample example);

    int updateByExample(@Param("record") PurchaseorderB record, @Param("example") PurchaseorderBExample example);

    int updateByPrimaryKeySelective(PurchaseorderB record);

    int updateByPrimaryKey(PurchaseorderB record);
}