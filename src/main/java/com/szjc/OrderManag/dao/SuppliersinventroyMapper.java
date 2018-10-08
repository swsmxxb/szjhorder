package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.Suppliersinventroy;
import com.szjc.OrderManag.bean.SuppliersinventroyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliersinventroyMapper {
    long countByExample(SuppliersinventroyExample example);

    int deleteByExample(SuppliersinventroyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Suppliersinventroy record);

    int insertSelective(Suppliersinventroy record);

    List<Suppliersinventroy> selectByExample(SuppliersinventroyExample example);

    Suppliersinventroy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Suppliersinventroy record, @Param("example") SuppliersinventroyExample example);

    int updateByExample(@Param("record") Suppliersinventroy record, @Param("example") SuppliersinventroyExample example);

    int updateByPrimaryKeySelective(Suppliersinventroy record);

    int updateByPrimaryKey(Suppliersinventroy record);

    List<Suppliersinventroy> searchsuppliersinventroy(@Param("quickSearch") String quickSearch);
}