package com.gospel.spring.cloud.demo.web.admin.feign.service.hystrix;

import com.gospel.spring.cloud.demo.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/*
 *项目名: spring-cloud-demo
 *文件名: AdminServiceHystrix
 *创建者: SCH
 *创建时间:2019/5/17 16:41
 *描述: TODO
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
