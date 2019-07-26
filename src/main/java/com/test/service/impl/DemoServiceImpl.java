package com.test.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.service.TestService;
import com.test.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-27 10:53
 * @Version: 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {
    // 以前需要注入mapper，现在通过dubbo服务接口注入
    /*@Resource
    private XXXMapper xxxMapper;*/
    @Reference
    private TestService testServiceImpl;

    @Override
    public void test() {
        String test = testServiceImpl.test();
        System.out.println(test);
    }
}
