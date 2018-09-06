package com.henry.cloud.member.controller;

import com.henry.cloud.member.dto.MemberModifyReqDto;
import io.swagger.annotations.ApiOperation;
import org.infrastructure.common.exception.ControllerException;
import org.infrastructure.result.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @Value("${from}")
    private String from;

    @Value("${spring.cloud.config.name}")
    private String localOne;

    @Value("${defconf.nottoken}")
    private String remoteOne;

    @ApiOperation(value = "读取配置中心测试")
    @GetMapping(value = "/get-config", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultData<String> getConfigCenter() {
        return ResultData.createSuccessResult("配置中心:" + from + "," + localOne + "," + remoteOne);
    }

    @ApiOperation(value = "入参校验")
    @PostMapping(value = "/valid-param", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultData<String> validParam(@Validated @RequestBody MemberModifyReqDto dto) {
        return ResultData.createSuccessResult("入参校验通过:" + dto.getPhone());
    }

    @ApiOperation(value = "异常处理测试")
    @GetMapping(value = "/exception-handler", produces = MediaType.APPLICATION_JSON_VALUE)
    public void exceptionHandler() {
        throw new ControllerException("异常处理测试");
    }

    @ApiOperation(value = "hello测试接口")
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultData<String> hello() {
        System.out.println("member service 被调用====================");
        return ResultData.createSuccessResult("member service");
    }

}
