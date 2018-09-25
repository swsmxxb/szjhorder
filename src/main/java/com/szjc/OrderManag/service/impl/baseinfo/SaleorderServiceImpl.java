package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.Saleorder;
import com.szjc.OrderManag.bean.SaleorderExample;
import com.szjc.OrderManag.service.baseinfo.SaleorderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleorderServiceImpl  implements SaleorderService<Saleorder, SaleorderExample> {

    @Override
    public long countByExample(SaleorderExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SaleorderExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Saleorder record) {
        return 0;
    }

    @Override
    public int insertSelective(Saleorder record) {
        return 0;
    }

    @Override
    public List<Saleorder> selectByExample(SaleorderExample example) {
        return null;
    }

    @Override
    public Saleorder selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Saleorder record, SaleorderExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Saleorder record, SaleorderExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Saleorder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Saleorder record) {
        return 0;
    }

    @Override
    public List<Saleorder> searchpurchase(String keyid) {
        return null;
    }
}
