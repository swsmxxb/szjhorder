package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.PurchaseorderH;
import com.szjc.OrderManag.bean.PurchaseorderHExample;
import com.szjc.OrderManag.dao.PurchaseorderHMapper;
import com.szjc.OrderManag.service.baseinfo.PurchaseorderHService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class PurchaseorderHImpl implements PurchaseorderHService<PurchaseorderH, PurchaseorderHExample> {

    @Autowired
    private PurchaseorderHMapper purchaseorderHMapper;

    @Override
    public long countByExample(PurchaseorderHExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(PurchaseorderHExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String hid) {
        return 0;
    }

    @Override
    public int insert(PurchaseorderH record) {
        return 0;
    }

    @Override
    public int insertSelective(PurchaseorderH record) {
        return 0;
    }

    @Override
    public List<PurchaseorderH> selectByExample(PurchaseorderHExample example) {
        return null;
    }

    @Override
    public PurchaseorderH selectByPrimaryKey(String hid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(PurchaseorderH record, PurchaseorderHExample example) {
        return 0;
    }

    @Override
    public int updateByExample(PurchaseorderH record, PurchaseorderHExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseorderH record) {
        {
            try {
                Method updateByPrimaryKeySelective = purchaseorderHMapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
                Object result = updateByPrimaryKeySelective.invoke(purchaseorderHMapper, record);
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
    public int updateByPrimaryKey(PurchaseorderH record) {
        return 0;
    }

    @Override
    public List<PurchaseorderH> searchpurchaseorderh(String quickSearch) {
        List<PurchaseorderH> PurchaseorderHList = purchaseorderHMapper.searchpurchaseorderh(quickSearch);
        return PurchaseorderHList;
    }
}
