package com.henry.cloud.message.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author huangj
 * @version V1.0
 * @title:  测试 DTO
 * @description:
 * @date 2018/9/3
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageDemoDto {

    @NotEmpty
    private String name;

    @NotNull
    private int age;
}
