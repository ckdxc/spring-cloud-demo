package com.gospel.spring.cloud.demo.web.admin.feign.controller;

import com.gospel.spring.cloud.demo.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 *项目名: spring-cloud-demo
 *文件名: AdminController
 *创建者: SCH
 *创建时间:2019/5/17 15:36
 *描述: TODO
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message) {
        return adminService.sayHi(message);
    }
}
