package com.znlccy.cms;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Adminstrator
 * @date: 2018/8/12 16:02
 * @version: v.1.0.0
 * @introduce: Swagger2配置类
 */

@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     * 配置扫描包
     * @return
     */
    @Bean
    public Docket createRestaApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.znlccy.cms"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建api信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot 使用 Swagger2 构建RESTful API")
                //创建人
                .contact(new Contact("ZNLCCY", "https://github.com/znlccy/cms", "756331868@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
}

