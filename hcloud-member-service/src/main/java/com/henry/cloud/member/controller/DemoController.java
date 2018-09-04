package com.henry.cloud.member.controller;

import org.infrastructure.result.ResultData;
import org.springframework.http.MediaType;
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
@RequestMapping("${api.url.prefix}")
public class DemoController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultData<String> hello() {
        System.out.println("member service 被调用====================");
        return ResultData.createSuccessResult("member service");
    }

}
