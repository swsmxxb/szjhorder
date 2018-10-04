package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.Inventoryinfo;
import com.szjc.OrderManag.bean.InventoryinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryinfoMapper {
    long countByExample(InventoryinfoExample example);

    int deleteByExample(InventoryinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Inventoryinfo record);

    int insertSelective(Inventoryinfo record);

    List<Inventoryinfo> selectByExample(InventoryinfoExample example);

    Inventoryinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Inventoryinfo record, @Param("example") InventoryinfoExample example);

    int updateByExample(@Param("record") Inventoryinfo record, @Param("example") InventoryinfoExample example);

    int updateByPrimaryKeySelective(Inventoryinfo record);

    int updateByPrimaryKey(Inventoryinfo record);
}