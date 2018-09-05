package com.henry.cloud.message.config;

import com.henry.cloud.common.config.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author huangj
 * @version V1.0
 * @title:
 * @description:    http://localhost:6011/hcloud-message/swagger-ui.html
 * @date 2018/9/5
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig{

    @Override
    protected String getBasePackage() {
        return "com.henry.cloud.message.controller";
    }

    @Override
    protected boolean getEnableSwagger() {
        return true;
    }

    @Override
    protected boolean getTokenParam() {
        return false;
    }
}
