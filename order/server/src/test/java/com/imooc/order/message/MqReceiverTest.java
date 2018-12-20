package com.imooc.order.message;

import com.imooc.order.OrderApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018-12-20.
 */
@Slf4j
public class MqReceiverTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void process() {
        amqpTemplate.convertAndSend("myQueue", "now " + new Date());
        log.info("已发送");
    }
}