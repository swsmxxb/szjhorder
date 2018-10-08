package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.bean.UserinfoExample;
import com.szjc.OrderManag.dao.UserinfoMapper;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class UserinfoImpl implements UserinfoService<Userinfo, UserinfoExample> {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public long countByExample(UserinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String uid) {
        return 0;
    }

    @Override
    public int insert(Userinfo record) {
        try {
            Method insert = userinfoMapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(userinfoMapper, record);
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
    public int insertSelective(Userinfo record) {
        return 0;
    }

    @Override
    public List<Userinfo> selectByExample(UserinfoExample example) {
        return null;
    }

    @Override
    public Userinfo selectByPrimaryKey(String uid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Userinfo record, UserinfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Userinfo record, UserinfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Userinfo record) {
        return 0;
    }

    @Override
    public List<Userinfo> searchuserinfo(String quickSearch) {
        List<Userinfo> userinfoList = userinfoMapper.searchuserinfo(quickSearch);
        return userinfoList;
    }
}
