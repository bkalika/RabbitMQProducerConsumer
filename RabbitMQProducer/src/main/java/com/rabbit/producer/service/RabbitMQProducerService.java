package com.rabbit.producer.service;

/**
 * @author @bkalika
 */
public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}
