package com.gospel.spring.cloud.demo.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 *项目名: spring-cloud-demo
 *文件名: RestTemplateConfiguration
 *创建者: SCH
 *创建时间:2019/5/17 13:37
 *描述: TODO
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
