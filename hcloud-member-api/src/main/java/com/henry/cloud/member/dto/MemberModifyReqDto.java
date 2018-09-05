package com.henry.cloud.member.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @Title:
 * @Description:    会员信息修改 DTO
 * @author huangj
 * @date 2018/7/10
 * @version V1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberModifyReqDto {

    @ApiModelProperty(value = "修改类型(1:修改头像;2:修改会员昵称;3:修改性别;4:修改登录密码;5:修改支付密码;6:修改手机号码)",required = true)
    @NotNull(message = "修改类型不能为空")
    private Integer modifyType;

    @ApiModelProperty(value = "业务类型编码(1:森特尔洗护;2:名品易手;4:态奢)",required = true)
    @NotNull(message = "业务编号不能为空")
    private Integer businessTypeCode;

    @ApiModelProperty(value = "手机号码")
    @NotEmpty(message = "手机号码不能为空")
    private String phone;

    @ApiModelProperty(value = "会员编码")
    private Long memberId;

}