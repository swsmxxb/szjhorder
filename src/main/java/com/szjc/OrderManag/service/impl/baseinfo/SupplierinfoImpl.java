package com.szjc.OrderManag.service.impl.baseinfo;


import com.szjc.OrderManag.bean.Supplierinfo;
import com.szjc.OrderManag.bean.SupplierinfoExample;
import com.szjc.OrderManag.dao.SupplierinfoMapper;
import com.szjc.OrderManag.service.baseinfo.SupplierinfoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class SupplierinfoImpl implements SupplierinfoService<Supplierinfo, SupplierinfoExample> {
    @Autowired
    private SupplierinfoMapper supplierinfoMapper;

    @Override
    public long countByExample(SupplierinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SupplierinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Supplierinfo record) {
        return 0;
    }

    @Override
    public int insertSelective(Supplierinfo record) {
        return 0;
    }

    @Override
    public List<Supplierinfo> selectByExample(SupplierinfoExample example) {
        return null;
    }

    @Override
    public Supplierinfo selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Supplierinfo record, SupplierinfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Supplierinfo record, SupplierinfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Supplierinfo record) {
        {
            try {
                Method updateByPrimaryKeySelective = supplierinfoMapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
                Object result = updateByPrimaryKeySelective.invoke(supplierinfoMapper, record);
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
    public int updateByPrimaryKey(Supplierinfo record) {
        return 0;
    }

    @Override
    public List<Supplierinfo> searchSupplier(String quickSearch) {
        List<Supplierinfo> supplierinfoList = supplierinfoMapper.searchSupplier(quickSearch);
        return supplierinfoList;
    }
}
