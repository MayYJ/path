package com.path.controller.distance;


import com.path.model.Distance;
import com.path.service.distance.DistanceService;
import com.path.util.JsonUtil;
import com.path.util.MapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author demo
 */
@Controller
@RequestMapping("distance")
public class DistanceController {
    @Resource
    private DistanceService distanceService;


    /**
     * 更新时间和距离
     *
     * @param postData 时间和距离
     *                 返回的剩余需要更新的条数
     */
    @RequestMapping("updatetimeanddis")
    public void updatetimeanddis(Distance postData) {
        int result = 0;
        int remainCount;
        Integer questionId = 1;
        postData.setDId(questionId);
        //不太优雅的设计，由于前端传过来的字符串有双引号，所以需要替换
        postData.setStartId(postData.getStartId().replaceAll("\"", ""));
        postData.setEndId(postData.getEndId().replaceAll("\"", ""));
        try {
            result = distanceService.updateByPrimaryKeySelective(postData);
            remainCount = distanceService.checkRemainCount(1);
        } catch (Exception e) {
            Map map = MapUtil.toMap(400, "更新失败" + e.getMessage(), result);
            JsonUtil.toJSON(map);
            return;
        }
        Map map = MapUtil.toMap(200, "更新成功", remainCount);
        JsonUtil.toJSON(map);

    }

    @RequestMapping("selectnullnode")
    public void selectnullnode(Integer questionId) {
        questionId = 1;
        //初始化
        if (distanceService.selectIfNull(questionId).getDId() == 0) {
            List<String> list = distanceService.produceAllWay(questionId);
            List<Distance> list2 = new ArrayList<>();
            for (String d : list) {
                for (String s : list) {
                    Distance distance = new Distance();
                    distance.setDId(questionId);
                    distance.setStartId(d);
                    distance.setEndId(s);
                    list2.add(distance);
                }

            }
            list2.forEach(e -> distanceService.insertSelective(e));
        }
        Distance distance = distanceService.selectNullNode(questionId);
        String startAddress = distanceService.selectCenterOrServiceAddress(distance.getStartId());
        String endAddress = distanceService.selectCenterOrServiceAddress(distance.getEndId());
        distance.setStartAddress(startAddress);
        distance.setEndAddress(endAddress);
        Map map = MapUtil.toMap(200, "下一条记录", distance);
        JsonUtil.toJSON(map);
    }


}
