package com.znlccy.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Adminstrator
 * @date: 2018/8/12 16:52
 * @version: v.1.0.0
 * @introduce: 应用启动类
 */
@SpringBootApplication
@Configuration
@EnableScheduling
@EnableAsync
@EnableSwagger2
public class CmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
}
