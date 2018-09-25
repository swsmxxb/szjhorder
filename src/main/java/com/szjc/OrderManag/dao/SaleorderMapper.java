package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.Saleorder;
import com.szjc.OrderManag.bean.SaleorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleorderMapper {
    long countByExample(SaleorderExample example);

    int deleteByExample(SaleorderExample example);

    int deleteByPrimaryKey(String id);

    int insert(Saleorder record);

    int insertSelective(Saleorder record);

    List<Saleorder> selectByExample(SaleorderExample example);

    Saleorder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Saleorder record, @Param("example") SaleorderExample example);

    int updateByExample(@Param("record") Saleorder record, @Param("example") SaleorderExample example);

    int updateByPrimaryKeySelective(Saleorder record);

    int updateByPrimaryKey(Saleorder record);

    List<Saleorder> searchpurchase(String keyid);

}