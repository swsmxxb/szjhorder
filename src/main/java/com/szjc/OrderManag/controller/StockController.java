package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Stockinfo;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.StockinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class StockController {

    @Autowired
    private StockinfoService stockinfoService;

    // 库存管理页面
    @GetMapping("/stocklist")
    public String stocklistpage(Model model) {
        return "stockinfo/stockinfopage";
    }

    // 库存查询页面
    @GetMapping("/stocksearch")
    public String stocksearch(Model model) {
        return "stockinfo/stocksearchpage";
    }


    // 查询库存操作流水
    @RequestMapping(value = "/searchstockinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result searchstockinfo(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = stockinfoService.searchStockinfo(quickSearch);
        return Result.successResult(list);
    }

    // 查询库存统计
    @RequestMapping(value = "/searchStockstatus", method = RequestMethod.POST)
    @ResponseBody
    public Result searchStockstatus(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = stockinfoService.searchStockstatus(quickSearch);
        return Result.successResult(list);
    }

    // 新增库存信息
    @RequestMapping(value = "/addstockinfo", method = RequestMethod.POST)
    @ResponseBody
    Result  addstockinfo(@RequestBody Stockinfo staff) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setId(uuid);
        staff.setCreatuser("bd64766be9934e4c8d9586dd224cece3");
        int list = stockinfoService.insert(staff);

        return Result.successResult(list);

    }

}
