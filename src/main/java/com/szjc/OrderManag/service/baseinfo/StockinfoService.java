package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Stockinfo;
import com.szjc.OrderManag.bean.StockinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockinfoService<Stockinfo, StockinfoExample> {

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
