package com.henry.cloud.message.component;

import org.infrastructure.common.web.spring.RestResponseEntityExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @author huangj
 * @version V1.0
 * @title:  异常处理器
 * @description:    该类会处理所有在执行标有@RequestMapping注解的方法时发生的异常
 * @date 2018/9/5
 */
@ControllerAdvice
public class MyAppExceptionHandler extends RestResponseEntityExceptionHandler {

}
