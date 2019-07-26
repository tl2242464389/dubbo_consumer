package com.test.controller;

import com.test.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-27 10:59
 * @Version: 1.0
 */
@Controller
public class DemoController {
    @Resource
    private DemoService demoServiceImpl;

    @RequestMapping("/test")
    public void test(){
        System.out.println("test---start");
        demoServiceImpl.test();
    }
}
