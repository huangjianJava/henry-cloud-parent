package com.henry.cloud.member.component;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.infrastructure.common.aop.RequestProcess;
import org.infrastructure.common.aop.RequestProcessAop;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author huangj
 * @version V1.0
 * @title:  切面 -> 日志记录和权限校验
 * @description:
 * @date 2018/9/6
 */
@Component
@Order(2)
@Aspect
public class MemberRequestAspect extends RequestProcessAop {

    @Value("${default.verifyCode}")
    private String verifyCode;

    @Override
    protected boolean getCheckToken() {
        return true;
    }

    @Override
    protected boolean checkLoginAuth(String tokenStr) {
        if(StringUtils.isEmpty(tokenStr)){
            return false;
        }

        if(tokenStr.equals(verifyCode)){
            System.out.println("权限校验通过=================");
            return true;
        }
        System.out.println("权限校验失败=================");
        return false;
    }

    @Override
    protected boolean checkPopedom(RequestProcess process) {
        return true;
    }

}
