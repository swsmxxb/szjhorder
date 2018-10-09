package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.SaleorderH;
import com.szjc.OrderManag.bean.SaleorderHExample;
import com.szjc.OrderManag.dao.SaleorderHMapper;
import com.szjc.OrderManag.service.baseinfo.SaleorderHService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class SaleorderHImpl implements SaleorderHService<SaleorderH, SaleorderHExample> {

    @Autowired
    private SaleorderHMapper saleorderHMapper;

    @Override
    public long countByExample(SaleorderHExample saleorderHExample) {
        return 0;
    }

    @Override
    public int deleteByExample(SaleorderHExample saleorderHExample) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String hid) {
        return 0;
    }

    @Override
    public int insert(SaleorderH record) {
        try {
            Method insert = saleorderHMapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(saleorderHMapper, record);
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
    public int insertSelective(SaleorderH record) {
        return 0;
    }

    @Override
    public List<SaleorderH> selectByExample(SaleorderHExample saleorderHExample) {
        return null;
    }

    @Override
    public SaleorderH selectByPrimaryKey(String hid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(SaleorderH record, SaleorderHExample saleorderHExample) {
        return 0;
    }

    @Override
    public int updateByExample(SaleorderH record, SaleorderHExample saleorderHExample) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SaleorderH record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SaleorderH record) {
        return 0;
    }

    @Override
    public List<SaleorderH> searchpurchase(String quickSearch) {
        List<SaleorderH> SaleorderHList = saleorderHMapper.searchpurchase(quickSearch);
        return SaleorderHList;
    }
}
