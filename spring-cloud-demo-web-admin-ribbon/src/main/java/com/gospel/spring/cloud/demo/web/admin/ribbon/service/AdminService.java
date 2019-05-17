package com.gospel.spring.cloud.demo.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*
 *项目名: spring-cloud-demo
 *文件名: AdminService
 *创建者: SCH
 *创建时间:2019/5/17 13:59
 *描述: TODO
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message) {
        return restTemplate.getForObject("http://spring-cloud-demo-service-admin/hi?message=" + message, String.class);
    }
}
