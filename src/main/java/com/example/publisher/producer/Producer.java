package com.example.publisher.producer;

import java.util.logging.Logger;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Producer {
  private final RabbitTemplate template;
  public void sendMessage(String message){
    System.out.println("message send: "+ message);
    template.convertAndSend("xyz_topic_exchange","xyz_routing_key",message);

  }

}
