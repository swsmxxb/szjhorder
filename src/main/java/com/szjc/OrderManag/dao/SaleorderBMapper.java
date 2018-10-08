package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.SaleorderB;
import com.szjc.OrderManag.bean.SaleorderBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleorderBMapper {
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
}