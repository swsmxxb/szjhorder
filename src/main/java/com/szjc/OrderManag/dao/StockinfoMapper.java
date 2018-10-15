package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.Stockinfo;
import com.szjc.OrderManag.bean.StockinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockinfoMapper {
    long countByExample(StockinfoExample example);

    int deleteByExample(StockinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Stockinfo record);

    int insertSelective(Stockinfo record);

    List<Stockinfo> selectByExample(StockinfoExample example);

    Stockinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Stockinfo record, @Param("example") StockinfoExample example);

    int updateByExample(@Param("record") Stockinfo record, @Param("example") StockinfoExample example);

    int updateByPrimaryKeySelective(Stockinfo record);

    int updateByPrimaryKey(Stockinfo record);

    List<Stockinfo> searchStockinfo(@Param("quickSearch") String quickSearch);

    List<Stockinfo> searchStockstatus(@Param("quickSearch") String quickSearch);

}