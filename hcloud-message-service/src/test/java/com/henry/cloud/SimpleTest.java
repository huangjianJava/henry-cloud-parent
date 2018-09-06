package com.henry.cloud;

import org.infrastructure.common.utils.encrypt.EncryptMD5Util;
import org.junit.Test;

/**
 * @author huangj
 * @version V1.0
 * @title: 一些简单测试
 * @description:
 * @date 2018/9/3
 */
public class SimpleTest {

    @Test
    public void testOthers() {
        String verifyCode = EncryptMD5Util.getMD5("123456");
        System.out.println("verifyCode:" + verifyCode);
    }
}
