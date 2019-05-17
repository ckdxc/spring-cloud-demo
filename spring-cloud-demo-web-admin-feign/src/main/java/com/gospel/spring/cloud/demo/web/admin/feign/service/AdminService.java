package com.gospel.spring.cloud.demo.web.admin.feign.service;

import com.gospel.spring.cloud.demo.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 *项目名: spring-cloud-demo
 *文件名: AdminService
 *创建者: SCH
 *创建时间:2019/5/17 15:33
 *描述: TODO
 */
@FeignClient(value = "spring-cloud-demo-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("message") String message);
}
