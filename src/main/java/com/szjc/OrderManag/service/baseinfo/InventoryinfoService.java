package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Inventoryinfo;
import com.szjc.OrderManag.bean.InventoryinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryinfoService<Inventoryinfo, InventoryinfoExample> {
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

    List<Inventoryinfo> searchInventory(@Param("quickSearch") String quickSearch);

}
