package com.henry.cloud.message.controller;

import com.henry.cloud.message.remote.MemberApiRemote;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.infrastructure.result.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    MemberApiRemote memberApiRemote;

    @ApiOperation(value = "日志记录测试")
    @GetMapping(value = "/log-test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultData<String> log() {
        logger.error("error 级别日志");
        logger.info("info 级别日志");
        return ResultData.createSuccessResult("日志记录测试");
    }

    @ApiOperation(value = "远程调用测试接口")
    @GetMapping(value = "/remote-invoke")
    public ResultData<String> remoteInvoke(){
        return memberApiRemote.hello();
    }

    @ApiOperation(value = "hello测试接口")
    @GetMapping(value = "/hello")
    public ResultData<String> hello(){
        return ResultData.createSuccessResult("message service");
    }

}
