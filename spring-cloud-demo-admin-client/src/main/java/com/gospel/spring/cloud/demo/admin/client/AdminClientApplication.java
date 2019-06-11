package com.gospel.spring.cloud.demo.admin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 *项目名: spring-cloud-demo
 *文件名: AdminClientApplication
 *创建者: SCH
 *创建时间:2019/6/11 9:37
 *描述: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AdminClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminClientApplication.class, args);
    }
}
