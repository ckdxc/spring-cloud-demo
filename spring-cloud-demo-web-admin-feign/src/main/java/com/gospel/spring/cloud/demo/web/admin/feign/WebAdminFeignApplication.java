package com.gospel.spring.cloud.demo.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 *项目名: spring-cloud-demo
 *文件名: WebAdminFeignApplication
 *创建者: SCH
 *创建时间:2019/5/17 15:29
 *描述: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
