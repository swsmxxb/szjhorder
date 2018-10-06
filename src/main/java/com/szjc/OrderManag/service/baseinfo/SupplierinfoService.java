package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Supplierinfo;
import com.szjc.OrderManag.bean.SupplierinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierinfoService<Supplierinfo, SupplierinfoExample> {
    long countByExample(com.szjc.OrderManag.bean.SupplierinfoExample example);

    int deleteByExample(com.szjc.OrderManag.bean.SupplierinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(com.szjc.OrderManag.bean.Supplierinfo record);

    int insertSelective(com.szjc.OrderManag.bean.Supplierinfo record);

    List<com.szjc.OrderManag.bean.Supplierinfo> selectByExample(com.szjc.OrderManag.bean.SupplierinfoExample example);

    com.szjc.OrderManag.bean.Supplierinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") com.szjc.OrderManag.bean.Supplierinfo record, @Param("example") com.szjc.OrderManag.bean.SupplierinfoExample example);

    int updateByExample(@Param("record") com.szjc.OrderManag.bean.Supplierinfo record, @Param("example") com.szjc.OrderManag.bean.SupplierinfoExample example);

    int updateByPrimaryKeySelective(com.szjc.OrderManag.bean.Supplierinfo record);

    int updateByPrimaryKey(com.szjc.OrderManag.bean.Supplierinfo record);

    List<com.szjc.OrderManag.bean.Supplierinfo> searchSupplier(@Param("quickSearch") String quickSearch);

}
