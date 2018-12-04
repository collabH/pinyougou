package com.huangsm.pinyougou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
//@EnableHystrix
@EnableEurekaClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
/**
 *applcation.yml配置文件中的参数含义
 *
 * #重点！/info必须使用http进行转发，lb代表从注册中心获取服务
 * # 重点！转发该路径！,/apisellergoods/**,
 * # http://localhost:9999/userapi/user/users/2, 必须加上StripPrefix=1，否则访问服务时会带上userapi
 * #而不是我们期望的去掉userapi，只保留**部分
 * #-name Hystrix gateWay整合hystrix
 */

}
