package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.response.RpcResult;
import com.api.service.APIUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yunkai on 2018/2/2.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Reference
    @Autowired
    private APIUserService aPIUserService;

    @RequestMapping(value = "/test")
    public RpcResult test(){
        return aPIUserService.findList();
    }
}
