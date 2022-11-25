package com.test.rabbitmq.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration.class})
public class RabbitMQTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQTestApplication.class, args);
    }

}
