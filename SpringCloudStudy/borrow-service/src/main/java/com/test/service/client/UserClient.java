package com.test.service.client;

import com.test.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-service")
public interface UserClient {
    //路径保证和其他微服务提供的一致即可
    @RequestMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") int uid);  //参数和返回值也保持一致
}
