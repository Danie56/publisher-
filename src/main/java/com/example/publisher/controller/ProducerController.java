package com.example.publisher.controller;

import com.example.publisher.producer.Metric;
import com.example.publisher.producer.Producer;
import com.example.publisher.services.CreateMetricService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@AllArgsConstructor
public class ProducerController {
  private final Producer producer;
  private final CreateMetricService createMetricService;
  @GetMapping
  public ResponseEntity<String> post() throws JsonProcessingException {
     producer.sendMessage();
     return new ResponseEntity<>(HttpStatus.OK);

  }


}
