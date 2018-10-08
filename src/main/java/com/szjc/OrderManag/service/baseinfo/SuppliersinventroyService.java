package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Suppliersinventroy;
import com.szjc.OrderManag.bean.SuppliersinventroyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuppliersinventroyService<Suppliersinventroy, SuppliersinventroyExample> {

    long countByExample(com.szjc.OrderManag.bean.SuppliersinventroyExample example);

    int deleteByExample(com.szjc.OrderManag.bean.SuppliersinventroyExample example);

    int deleteByPrimaryKey(String id);

    int insert(com.szjc.OrderManag.bean.Suppliersinventroy record);

    int insertSelective(com.szjc.OrderManag.bean.Suppliersinventroy record);

    List<com.szjc.OrderManag.bean.Suppliersinventroy> selectByExample(com.szjc.OrderManag.bean.SuppliersinventroyExample example);

    com.szjc.OrderManag.bean.Suppliersinventroy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") com.szjc.OrderManag.bean.Suppliersinventroy record, @Param("example") com.szjc.OrderManag.bean.SuppliersinventroyExample example);

    int updateByExample(@Param("record") com.szjc.OrderManag.bean.Suppliersinventroy record, @Param("example") com.szjc.OrderManag.bean.SuppliersinventroyExample example);

    int updateByPrimaryKeySelective(com.szjc.OrderManag.bean.Suppliersinventroy record);

    int updateByPrimaryKey(com.szjc.OrderManag.bean.Suppliersinventroy record);

    List<com.szjc.OrderManag.bean.Suppliersinventroy> searchsuppliersinventroy(@Param("quickSearch") String quickSearch);
}
