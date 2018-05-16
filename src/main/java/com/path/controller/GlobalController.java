package com.path.controller;

import com.path.model.CenterNode;
import com.path.model.ServiceNode;
import com.path.model.Vahicle;
import com.path.service.csv.CsvService;
import com.path.service.distance.DistanceService;
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
    private DistanceService distanceService;

    @Resource
    private RouteService routeService;

    @RequestMapping("deleteAllData")
    public void deleteAllData(){
        if (!centerNodeCsvService.deleteData() ||
                !serviceNodeCsvService.deleteData() ||
                !vahicleCsvService.deleteData() ||
                !routeService.removeAllRoutesAndFinalSolutions()||
                !distanceService.deleteDistanceData()){
            Map map = MapUtil.toMap(200, "操作：清空整个数据库；状态：失败", null);
            JsonUtil.toJSON(map);
        }else {
            Map map = MapUtil.toMap(200, "操作：清空整个数据库；状态：成功", null);
            JsonUtil.toJSON(map);
        }
    }
}
