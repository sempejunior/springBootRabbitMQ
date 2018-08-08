package com.example.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableRabbit
@SpringBootApplication
public class RabbitMqApplication {

    @Value("${queue.example.name}")
    private String exampleQueue;


    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);



    }

    @Bean
    public Queue queue() {
        return new Queue(exampleQueue, true);
    }
}
