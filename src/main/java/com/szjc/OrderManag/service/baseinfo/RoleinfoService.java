package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Roleinfo;
import com.szjc.OrderManag.bean.RoleinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleinfoService<Roleinfo, RoleinfoExample> {
    long countByExample(RoleinfoExample example);

    int deleteByExample(RoleinfoExample example);

    int deleteByPrimaryKey(String rid);

    int insert(Roleinfo record);

    int insertSelective(Roleinfo record);

    List<Roleinfo> selectByExample(RoleinfoExample example);

    Roleinfo selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") Roleinfo record, @Param("example") RoleinfoExample example);

    int updateByExample(@Param("record") Roleinfo record, @Param("example") RoleinfoExample example);

    int updateByPrimaryKeySelective(Roleinfo record);

    int updateByPrimaryKey(Roleinfo record);

    List<Roleinfo> searchroleinfo(@Param("quickSearch") String quickSearch);
}
