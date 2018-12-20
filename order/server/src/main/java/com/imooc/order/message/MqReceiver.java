package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-12-20.
 */
@Slf4j
@Component
public class MqReceiver {

//    1.直接监听队列
//    @RabbitListener(queues = "myQueue")
//    2.创建队列并且监听队列
//    @RabbitListener(queuesToDeclare = @Queue("myQueue"))
//    3.创建队列，EXchange与Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message){
        log.info("MqReceiver: {}", message);
    }
}
