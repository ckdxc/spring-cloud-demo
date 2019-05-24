package com.gospel.spring.cloud.demo.web.admin.feign.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *项目名: spring-cloud-demo
 *文件名: TestController
 *创建者: SCH
 *创建时间:2019/5/23 17:11
 *描述: TODO
 */
@RestController
public class TestController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String  profile(){
        return this.profile;
    }
}
