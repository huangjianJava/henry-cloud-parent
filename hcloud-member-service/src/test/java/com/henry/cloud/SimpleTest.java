package com.henry.cloud;

import com.henry.cloud.common.enums.YesOrNoEnum;
import com.henry.cloud.member.dto.DemoDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author huangj
 * @version V1.0
 * @title:  一些简单测试
 * @description:
 * @date 2018/9/3
 */
public class SimpleTest {

    @Test
    public void testOthers(){
        int yes = YesOrNoEnum.YES.getValue();
        System.out.println("yes:" + yes);

        DemoDto demoDto = DemoDto.builder()
                .name("测试")
                .age(23)
                .build();
        System.out.println("demo:" + demoDto.getName());
    }
}
