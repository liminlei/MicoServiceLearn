package com.imooc.order.controller;

import com.imooc.order.client.ProductClient;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018-12-17.
 */
@Slf4j
@RestController
public class ClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/productMsg_RestTemplate")
    public String getProductMsgRestTemplate(){
        //1.第一种方式，直接使用RestTemplate，URL硬编码
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);
//        log.info("response={}", response);

        //2.第二种方式，LoadBalancerClient通过服务名获取URL，然后使用RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        String url = new StringBuilder("http://")
                .append(serviceInstance.getHost())
                .append(":")
                .append(serviceInstance.getPort())
                .append("/msg").toString();
        String response = restTemplate.getForObject(url, String.class);
        response = response + "  "+ url;
        log.info("response={}", response);

        //3.第三种方式，RestTemplateConfig配置一个Bean，注意@LoadBalanced注解
//        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        return response;

    }

    @GetMapping("/productMsg_Feign")
    public String getProductMsg_Feign(){
        String response = productClient.productMsg();
        return response;
    }
}
