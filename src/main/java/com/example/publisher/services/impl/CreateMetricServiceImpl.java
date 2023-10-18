package com.example.publisher.services.impl;

import com.example.publisher.producer.Metric;
import com.example.publisher.services.CreateMetricService;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CreateMetricServiceImpl implements CreateMetricService {
  private final Random random =new Random();


  @Override
  public Metric createMetric() {
    Metric metric = new Metric(generatePlate(),generateGasoline());
    return metric;
  }

  private Float generateGasoline() {
    List<Float> gasolines = List.of(1.3f,7.8f,20.7f,9.0f);
    int randomGasoline =  random.nextInt(gasolines.size());
    return gasolines.get(randomGasoline);

  }

  private String generatePlate(){
    List<String> registeredPlate = List.of("XYZ789", "QWE456", "MNO123", "DEF789", "UVW456", "GHI123");
    int randomPlate = random.nextInt(registeredPlate.size());
    return registeredPlate.get(randomPlate);
  }
}
