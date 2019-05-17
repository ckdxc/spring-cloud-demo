package com.gospel.spring.cloud.demo.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 *项目名: spring-cloud-demo
 *文件名: WebAdminRibbonApplication
 *创建者: SCH
 *创建时间:2019/5/17 13:24
 *描述: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
