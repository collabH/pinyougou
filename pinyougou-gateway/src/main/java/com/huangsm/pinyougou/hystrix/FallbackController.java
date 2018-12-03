package com.huangsm.pinyougou.hystrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关的断路器，当服务停掉后，走此方法
 * @PACKAGE_NAME com.huangsm.pinyougou.hystrix
 * @PROJECT_NAME pinyougou
 * @创建人 huang
 * @创建时间 2018/12/3
 */
@RestController
@RequestMapping("/fallback")
public class FallbackController {
    @RequestMapping("")
    public String fallback(){
        String message = "{\n" +
                "\"code\": 200,\n" +
                "\"message\": \"微服务故障, 请稍后再试\"\n" +
                "}";
        return message;
    }
}
