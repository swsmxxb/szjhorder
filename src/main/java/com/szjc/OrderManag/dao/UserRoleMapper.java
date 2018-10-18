package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.UserRole;
import com.szjc.OrderManag.bean.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    long countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(String userRoleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExampleWithBLOBs(UserRoleExample example);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(String userRoleId);

    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKeyWithBLOBs(UserRole record);

    int updateByPrimaryKey(UserRole record);
}