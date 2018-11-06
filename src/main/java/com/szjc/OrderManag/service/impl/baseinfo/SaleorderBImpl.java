package com.szjc.OrderManag.service.impl.baseinfo;


import com.szjc.OrderManag.bean.SaleorderB;
import com.szjc.OrderManag.bean.SaleorderBExample;
import com.szjc.OrderManag.dao.SaleorderBMapper;
import com.szjc.OrderManag.service.baseinfo.SaleorderBService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class SaleorderBImpl implements SaleorderBService<SaleorderB, SaleorderBExample> {

    @Autowired
    private SaleorderBMapper saleorderBMapper;

    @Override
    public long countByExample(SaleorderBExample saleorderBExample) {
        return 0;
    }

    @Override
    public int deleteByExample(SaleorderBExample saleorderBExample) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String bid) {
        return 0;
    }

    @Override
    public int insert(SaleorderB record) {   try {
        Method insert = saleorderBMapper.getClass().getDeclaredMethod("insert", record.getClass());
        Object result = insert.invoke(saleorderBMapper, record);
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
    public int insertSelective(SaleorderB record) {
        return 0;
    }

    @Override
    public List<SaleorderB> selectByExample(SaleorderBExample saleorderBExample) {
        return null;
    }

    @Override
    public SaleorderB selectByPrimaryKey(String bid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(SaleorderB record, SaleorderBExample saleorderBExample) {
        return 0;
    }

    @Override
    public int updateByExample(SaleorderB record, SaleorderBExample saleorderBExample) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SaleorderB record) {
        {
            try {
                Method updateByPrimaryKeySelective = saleorderBMapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
                Object result = updateByPrimaryKeySelective.invoke(saleorderBMapper, record);
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
    public int updateByPrimaryKey(SaleorderB record) {
        return 0;
    }

    @Override
    public List<SaleorderB> searchorderb(String HID) {
        List<SaleorderB> SaleorderBList = saleorderBMapper.searchorderb(HID);
        return SaleorderBList;
    }

    @Override
    public List<SaleorderB> searchorderbgroup(String hid) {
        List<SaleorderB> SaleorderBList = saleorderBMapper.searchorderbgroup(hid);
        return SaleorderBList;
    }
}
