package main.java.com.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author @bkalika
 */
@Component
@EnableRabbit
public class RabbitMQConsumer {

    @RabbitListener(queues = "queue1")
    public void processMyQueue(String message) {
        System.out.printf("Received from myQueue : %s", new String(message.getBytes()));
    }
}
