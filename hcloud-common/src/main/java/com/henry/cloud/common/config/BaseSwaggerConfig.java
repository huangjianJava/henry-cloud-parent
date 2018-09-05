package com.henry.cloud.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangj
 * @version V1.0
 * @title: swagger ui 配置基础类
 * @description: Restful API 访问路径: http://IP:port/{context-path}/swagger-ui.html
 * @date 2018/9/3
 */
public abstract class BaseSwaggerConfig {

    /**
     * 扫描 controller 的路径
     *
     * @return
     */
    protected abstract String getBasePackage();

    /**
     * 是否开启 swagger ui
     *
     * @return true:开启 false:不开启
     */
    protected boolean getEnableSwagger() {
        return false;
    }

    /**
     * 是否需要 token 检查
     *
     * @return true:需要 false:不需要
     */
    protected boolean getTokenParam() {
        return false;
    }

    /**
     * swagger 描述
     *
     * @return
     */
    protected String getDescName() {
        return "";
    }

    /**
     * swagger 版本
     *
     * @return
     */
    protected String getVersion() {
        return "1.0.1";
    }

    @Bean
    public Docket createRestApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        if (getTokenParam()) {
            tokenPar.name("x-access-token")
                    .description("令牌")
                    .modelRef(new ModelRef("string"))
                    .parameterType("header")
                    .required(false)
                    .build();
            pars.add(tokenPar.build());
        }

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(getEnableSwagger())
                .select()
                .apis(RequestHandlerSelectors.basePackage(getBasePackage()))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact(getDescName(), "", "");
        return new ApiInfoBuilder()
                .title("Spring Restful中使用Swagger2构建RESTful APIs")
                .description("Platform's REST API, all the applications could access the Object model data via JSON.")
                .termsOfServiceUrl("No terms of service")
                .contact(contact)
                .version(getVersion())
                .build();
    }

}
