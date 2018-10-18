package com.szjc.OrderManag.dao;

import com.szjc.OrderManag.bean.Permissioninfo;
import com.szjc.OrderManag.bean.PermissioninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissioninfoMapper {
    long countByExample(PermissioninfoExample example);

    int deleteByExample(PermissioninfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Permissioninfo record);

    int insertSelective(Permissioninfo record);

    List<Permissioninfo> selectByExample(PermissioninfoExample example);

    Permissioninfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Permissioninfo record, @Param("example") PermissioninfoExample example);

    int updateByExample(@Param("record") Permissioninfo record, @Param("example") PermissioninfoExample example);

    int updateByPrimaryKeySelective(Permissioninfo record);

    int updateByPrimaryKey(Permissioninfo record);
}