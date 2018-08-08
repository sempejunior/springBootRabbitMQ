package com.example.rabbitmq.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class ExampleConsumer {

    private CountDownLatch latch = new CountDownLatch(1);

    @RabbitListener(queues = {"${queue.example.name}"})
    public void receive(@Payload String fileBody)
    {
        System.out.println("Received <" + fileBody + ">");
        latch.countDown();
    }

}
