package com.huangsm.pinyougou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务器入口类
 */
@SpringBootApplication
@EnableEurekaServer
public class PinyougouEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PinyougouEurekaApplication.class, args);
    }
}
