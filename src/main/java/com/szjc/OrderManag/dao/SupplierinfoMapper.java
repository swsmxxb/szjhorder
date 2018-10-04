package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.Supplierinfo;
import com.szjc.OrderManag.bean.SupplierinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierinfoMapper {
    long countByExample(SupplierinfoExample example);

    int deleteByExample(SupplierinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Supplierinfo record);

    int insertSelective(Supplierinfo record);

    List<Supplierinfo> selectByExample(SupplierinfoExample example);

    Supplierinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Supplierinfo record, @Param("example") SupplierinfoExample example);

    int updateByExample(@Param("record") Supplierinfo record, @Param("example") SupplierinfoExample example);

    int updateByPrimaryKeySelective(Supplierinfo record);

    int updateByPrimaryKey(Supplierinfo record);
}