package com.henry.cloud.member.api;

import org.infrastructure.result.ResultData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangj
 * @version V1.0
 * @title:  对外接口 feign
 * @description:
 * @date 2018/9/4
 */
public interface MemberApiService {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    ResultData<String> hello();

}
