package com.example.publisher.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
  @Bean
  public Queue queue(){
    return new Queue("xyz_queue");
  }
  @Bean
  public TopicExchange exchange(){
    return new TopicExchange("xyz_topic_exchange");
  }
  @Bean
  public Binding binding(){
    return BindingBuilder
        .bind(queue())
        .to(exchange())
        .with("xyz_routing_key");
  }



}
