package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Saleorder;
import com.szjc.OrderManag.bean.SaleorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleorderService<Saleorder, SaleorderExample> {

    long countByExample(com.szjc.OrderManag.bean.SaleorderExample example);

    int deleteByExample(com.szjc.OrderManag.bean.SaleorderExample example);

    int deleteByPrimaryKey(String id);

    int insert(com.szjc.OrderManag.bean.Saleorder record);

    int insertSelective(com.szjc.OrderManag.bean.Saleorder record);

    List<com.szjc.OrderManag.bean.Saleorder> selectByExample(com.szjc.OrderManag.bean.SaleorderExample example);

    com.szjc.OrderManag.bean.Saleorder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") com.szjc.OrderManag.bean.Saleorder record, @Param("example") com.szjc.OrderManag.bean.SaleorderExample example);

    int updateByExample(@Param("record") com.szjc.OrderManag.bean.Saleorder record, @Param("example") com.szjc.OrderManag.bean.SaleorderExample example);

    int updateByPrimaryKeySelective(com.szjc.OrderManag.bean.Saleorder record);

    int updateByPrimaryKey(com.szjc.OrderManag.bean.Saleorder record);

    List<com.szjc.OrderManag.bean.Saleorder> searchpurchase(String keyid);
}
