package com.path.controller;

import com.path.model.CenterNode;
import com.path.model.ServiceNode;
import com.path.model.Vahicle;
import com.path.service.csv.CsvService;
import com.path.service.route.RouteService;
import com.path.util.JsonUtil;
import com.path.util.MapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("global")
public class GlobalController {

    @Resource
    private CsvService<CenterNode> centerNodeCsvService;

    @Resource
    private CsvService<ServiceNode> serviceNodeCsvService;

    @Resource
    private CsvService<Vahicle> vahicleCsvService;

    @Resource
    private RouteService routeService;

    @RequestMapping("deleteAllData")
    public void deleteAllData(){
        if (!centerNodeCsvService.deleteData() ||
                !serviceNodeCsvService.deleteData() ||
                !vahicleCsvService.deleteData() ||
                !routeService.removeAllRoutesAndFinalSolutions()){
            Map map = MapUtil.toMap(200, "操作成功", null);
            JsonUtil.toJSON(map);
        }else {
            Map map = MapUtil.toMap(200, "添加成功", null);
            JsonUtil.toJSON(map);
        }
    }
}
