package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.Inventoryinfo;
import com.szjc.OrderManag.dao.InventoryinfoMapper;
import com.szjc.OrderManag.service.baseinfo.InventoryinfoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class InventoryinfoImpl implements InventoryinfoService {

    @Autowired
    private InventoryinfoMapper inventoryinfoMapper;

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
            Method insert = inventoryinfoMapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(inventoryinfoMapper, record);
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
        {
            try {
                Method updateByPrimaryKeySelective = inventoryinfoMapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
                Object result = updateByPrimaryKeySelective.invoke(inventoryinfoMapper, record);
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
//        return mapper.updateByPrimaryKeySelective(record);
        }
    }

    @Override
    public int updateByPrimaryKey(Object record) {
        return 0;
    }

    @Override
    public List searchInventory(String quickSearch) {
        List<Inventoryinfo> InventoryinfoList = inventoryinfoMapper.searchInventory(quickSearch);
        return InventoryinfoList;
    }
}
