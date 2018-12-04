package com.huangsm.pinyougou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2配置
 *
 * @PACKAGE_NAME com.huangsm.pinyougou.config
 * @PROJECT_NAME pinyougou
 * @创建人 huang
 * @创建时间 2018/12/4
 */
@Configuration
@EnableSwagger2 //开启swagger2
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("品牌管理")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huangsm.pinyougou.web.rpc"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger RESTful APIs")
                .description("swagger RESTful APIs")
                .termsOfServiceUrl("https://github.com/babybabywang")
                .contact("h1261109615@qq.com")
                .version("1.0")
                .build();
    }
}
