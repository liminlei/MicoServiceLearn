package com.imooc.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-12-20.
 */
@Data
@Component
@ConfigurationProperties("girl")
public class GirlConfig {

    private String name;

    private Integer age;
}
