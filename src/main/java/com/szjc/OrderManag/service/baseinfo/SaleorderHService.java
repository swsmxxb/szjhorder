package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.SaleorderH;
import com.szjc.OrderManag.bean.SaleorderHExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleorderHService<SaleorderH, SaleorderHExample> {

    long countByExample(SaleorderHExample example);

    int deleteByExample(SaleorderHExample example);

    int deleteByPrimaryKey(String hid);

    int insert(SaleorderH record);

    int insertSelective(SaleorderH record);

    List<SaleorderH> selectByExample(SaleorderHExample example);

    SaleorderH selectByPrimaryKey(String hid);

    int updateByExampleSelective(@Param("record") SaleorderH record, @Param("example") SaleorderHExample example);

    int updateByExample(@Param("record") SaleorderH record, @Param("example") SaleorderHExample example);

    int updateByPrimaryKeySelective(SaleorderH record);

    int updateByPrimaryKey(SaleorderH record);

    List<com.szjc.OrderManag.bean.SaleorderH> searchpurchase(String keyid);
}
