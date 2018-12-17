package com.imooc.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 定义需要调用其它服务的接口，这里是PRODUCT服务
 * Created by Administrator on 2018-12-17.
 */
@FeignClient(name = "PRODUCT")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();
}

//1.引入Feign的pom文件
//2.主类上加注解@EnableFeignClients
//3.用此类来注册需要调用的服务和接口