package com.test.rabbitmq.study.queue;

import com.test.rabbitmq.study.domain.MenuOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener
public class RabbitMQReceiver {

    private static Logger logger = LogManager.getLogger(RabbitMQReceiver.class);
    @RabbitHandler
    public void receiver(MenuOrder menuOrder){
        logger.info("MenuOrder listener invoked - Consuming Message with MenuOrder Identifier : "+ menuOrder.getOrderIdentifier());


    }

}
