package com.henry.cloud.controller;

import org.infrastructure.result.ResultData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangj
 * @version V1.0
 * @title:
 * @description:
 * @date 2018/9/4
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping(value = "/hello")
    public ResultData<String> hello(){
        return ResultData.createSuccessResult("hello world");
    }

}
