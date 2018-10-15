package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.Stockinfo;
import com.szjc.OrderManag.dao.StockinfoMapper;
import com.szjc.OrderManag.service.baseinfo.StockinfoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class StockinfoImpl implements StockinfoService {

    @Autowired
    private StockinfoMapper stockinfoMapper;

    @Override
    public long countByExample(Object o) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Object record) {
        try {
            Method insert = stockinfoMapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(stockinfoMapper, record);
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
    public int insertSelective(Object record) {
        return 0;
    }

    @Override
    public List selectByExample(Object o) {
        return null;
    }

    @Override
    public Object selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Object record, Object o) {
        return 0;
    }

    @Override
    public int updateByExample(Object record, Object o) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Object record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Object record) {
        return 0;
    }

    @Override
    public List searchStockinfo(String quickSearch) {
        List<Stockinfo> StockinfoList = stockinfoMapper.searchStockinfo(quickSearch);
        return StockinfoList;
    }

    @Override
    public List searchStockstatus(String quickSearch) {
        List<Stockinfo> StockinfostatusList = stockinfoMapper.searchStockstatus(quickSearch);
        return StockinfostatusList;
    }
}
