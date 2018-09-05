package com.henry.cloud.message.controller;

import com.henry.cloud.message.remote.MemberApiRemote;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.infrastructure.result.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    MemberApiRemote memberApiRemote;

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
