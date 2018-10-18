package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.Roleinfo;
import com.szjc.OrderManag.bean.RoleinfoExample;
import com.szjc.OrderManag.dao.RoleinfoMapper;
import com.szjc.OrderManag.service.baseinfo.RoleinfoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class RoleinfoImpl implements RoleinfoService<Roleinfo, RoleinfoExample> {

    @Autowired
    private RoleinfoMapper roleinfoMapper;

    @Override
    public long countByExample(RoleinfoExample roleinfoExample) {
        return 0;
    }

    @Override
    public int deleteByExample(RoleinfoExample roleinfoExample) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String rid) {
        return 0;
    }

    @Override
    public int insert(Roleinfo record) {
        try {
            Method insert = roleinfoMapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(roleinfoMapper, record);
            return Integer.parseInt(result.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertSelective(Roleinfo record) {
        return 0;
    }

    @Override
    public List<Roleinfo> selectByExample(RoleinfoExample roleinfoExample) {
        return null;
    }

    @Override
    public Roleinfo selectByPrimaryKey(String rid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Roleinfo record, RoleinfoExample roleinfoExample) {
        return 0;
    }

    @Override
    public int updateByExample(Roleinfo record, RoleinfoExample roleinfoExample) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Roleinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Roleinfo record) {
        return 0;
    }

    @Override
    public List<Roleinfo> searchroleinfo(String quickSearch) {
        List<Roleinfo> roleinfoList = roleinfoMapper.searchroleinfo(quickSearch);
        return roleinfoList;
    }
}
