package com.henry.cloud.message.remote;

import com.henry.cloud.member.api.MemberApiService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author huangj
 * @Title 远程调用用户服务
 * @Description
 * @date 2018/7/30
 **/
@FeignClient(name = "${member.service.name}/${member.api.prefix}", url = "${member.api.host}")
public interface MemberApiRemote extends MemberApiService {

}
