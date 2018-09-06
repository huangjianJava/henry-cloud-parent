package com.henry.cloud.member.component;

import org.aspectj.lang.annotation.Aspect;
import org.infrastructure.common.aop.RequestProcess;
import org.infrastructure.common.aop.RequestProcessAop;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author huangj
 * @version V1.0
 * @title:  切面 -> 日志记录和权限校验
 * @description:    该配置目前只做接口日志记录，不做权限校验
 * @date 2018/9/6
 */
@Component
@Order(2)
@Aspect
public class MemberRequestAspect extends RequestProcessAop {

    @Override
    protected boolean getCheckToken() {
        return false;
    }

    @Override
    protected boolean checkLoginAuth(String tokenStr) {
        return true;
    }

    @Override
    protected boolean checkPopedom(RequestProcess process) {
        return true;
    }

}
