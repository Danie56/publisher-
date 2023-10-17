package com.example.publisher.controller;

import com.example.publisher.producer.Producer;
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
  @GetMapping
  public ResponseEntity<String> post(){
     producer.sendMessage("hellos");
     return new ResponseEntity<>(HttpStatus.OK);

  }


}
