package com.szjc.OrderManag.service.baseinfo;

import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.bean.UserinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoService<Userinfo, UserinfoExample> {

    long countByExample(com.szjc.OrderManag.bean.UserinfoExample example);

    int deleteByExample(com.szjc.OrderManag.bean.UserinfoExample example);

    int deleteByPrimaryKey(String uid);

    int insert(com.szjc.OrderManag.bean.Userinfo record);

    int insertSelective(com.szjc.OrderManag.bean.Userinfo record);

    List<com.szjc.OrderManag.bean.Userinfo> selectByExample(com.szjc.OrderManag.bean.UserinfoExample example);

    com.szjc.OrderManag.bean.Userinfo selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") com.szjc.OrderManag.bean.Userinfo record, @Param("example") com.szjc.OrderManag.bean.UserinfoExample example);

    int updateByExample(@Param("record") com.szjc.OrderManag.bean.Userinfo record, @Param("example") com.szjc.OrderManag.bean.UserinfoExample example);

    int updateByPrimaryKeySelective(com.szjc.OrderManag.bean.Userinfo record);

    int updateByPrimaryKey(com.szjc.OrderManag.bean.Userinfo record);

    List<com.szjc.OrderManag.bean.Userinfo> searchuserinfo(@Param("quickSearch") String quickSearch);

    List<com.szjc.OrderManag.bean.Userinfo> selectUserByUserName(String userName);
}
