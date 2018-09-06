
package com.henry.cloud.member.config;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.infrastructure.common.constants.ShareConstants;

/**
 * @author zengtaoping
 * @version V1.0
 * @Title: 公共认证拦截器
 * @Description: 描述
 * @date 2018/06/06 10:20
 **/
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    private String token;
    
    public FeignBasicAuthRequestInterceptor(String token) {
        this.token = token;
    }

    @Override
    public void apply(RequestTemplate template) {
        template.header(ShareConstants.TOKEN_HEADER_NAME, token);
    }

}
