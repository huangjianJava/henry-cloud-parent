package com.henry.cloud.message.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangj
 * @version V1.0
 * @title: 消息服务feign配置
 * @description:
 * @date 2018/9/6
 */
@Configuration
public class MessageFeignConfiguration {

    @Value("${default.verifyCode}")
    private String verifyCode;

    @Value("${default.verifyServiceName}")
    private String verifyServiceName;

    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor(verifyCode, verifyServiceName);
    }
}
