package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.SaleorderB;
import com.szjc.OrderManag.bean.SaleorderBExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleorderBService<SaleorderB, SaleorderBExample> {

    long countByExample(SaleorderBExample example);

    int deleteByExample(SaleorderBExample example);

    int deleteByPrimaryKey(String bid);

    int insert(SaleorderB record);

    int insertSelective(SaleorderB record);

    List<SaleorderB> selectByExample(SaleorderBExample example);

    SaleorderB selectByPrimaryKey(String bid);

    int updateByExampleSelective(@Param("record") SaleorderB record, @Param("example") SaleorderBExample example);

    int updateByExample(@Param("record") SaleorderB record, @Param("example") SaleorderBExample example);

    int updateByPrimaryKeySelective(SaleorderB record);

    int updateByPrimaryKey(SaleorderB record);

    List<SaleorderB> searchorderb(@Param("HID") String HID);

    List<SaleorderB> searchorderbgroup(@Param("hid") String hid);
}
