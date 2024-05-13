package com.example.demo.controller;

import com.example.demo.Coach;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConstructorController {

  private final Coach coach;

  @Value("${myvalue.value}")
  String value;

  @GetMapping("/training")
  String training(){
    return coach.train();
  }

  @GetMapping("/")
  String helloWorldController(){
    return "Hello new World";
  }

  @GetMapping("/new-endpoint")
  String newEndpoint(){
    return "it's new endpoint" + value;}
}

