package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author by Antlers Email:3219599757@qq.com
 * @Description
 * @date 2022/11/6.
 * @package_name com.kob.backend.controller.pk
 **/
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String,String> getBotInfo(){
       List<Map<String,String>> list = new LinkedList<>();
       Map<String, String> bot1 = new HashMap<>();
       bot1.put("name","tiger");
       bot1.put("rating","1500");
       return bot1;
    }
}
