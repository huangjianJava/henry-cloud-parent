package com.henry.cloud.message.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.infrastructure.common.constants.ShareConstants;

/**
 * @author huangj
 * @version V1.0
 * @title: feign 请求拦截器
 * @description:
 * @date 2018/9/6
 */
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    private String token;

    private String serviceName;

    public FeignBasicAuthRequestInterceptor(String token, String serviceName) {
        this.token = token;
        this.serviceName = serviceName;
    }

    @Override
    public void apply(RequestTemplate template) {
        template.header(ShareConstants.TOKEN_HEADER_NAME, token);
        template.header(ShareConstants.TOKEN_SERVICE_NAME, serviceName);
    }

}
