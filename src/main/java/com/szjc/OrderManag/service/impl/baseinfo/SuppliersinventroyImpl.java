package com.szjc.OrderManag.service.impl.baseinfo;

import com.szjc.OrderManag.bean.Suppliersinventroy;
import com.szjc.OrderManag.bean.SuppliersinventroyExample;
import com.szjc.OrderManag.dao.SuppliersinventroyMapper;
import com.szjc.OrderManag.service.baseinfo.SuppliersinventroyService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@MapperScan(basePackages = "com.szjc.OrderManag.dao")
public class SuppliersinventroyImpl implements SuppliersinventroyService<Suppliersinventroy, SuppliersinventroyExample> {

    @Autowired
    SuppliersinventroyMapper suppliersinventroyMapper;

    @Override
    public long countByExample(SuppliersinventroyExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SuppliersinventroyExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Suppliersinventroy record) {
        return 0;
    }

    @Override
    public int insertSelective(Suppliersinventroy record) {
        return 0;
    }

    @Override
    public List<Suppliersinventroy> selectByExample(SuppliersinventroyExample example) {
        return null;
    }

    @Override
    public Suppliersinventroy selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Suppliersinventroy record, SuppliersinventroyExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Suppliersinventroy record, SuppliersinventroyExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Suppliersinventroy record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Suppliersinventroy record) {
        return 0;
    }

    @Override
    public List<Suppliersinventroy> searchsuppliersinventroy(String quickSearch) {
        List<Suppliersinventroy> suppliersinventroyList = suppliersinventroyMapper.searchsuppliersinventroy(quickSearch);
        return suppliersinventroyList;
    }
}
