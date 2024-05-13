package com.example.componentsscanning.rest;

import com.example.componentsscanning.common.Coach;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final Coach coach;

  @GetMapping("/training")
  String training(){
    return coach.train();
  }
}
