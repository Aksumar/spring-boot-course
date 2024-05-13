package com.example.componentsscanning.rest;

import com.example.componentsscanning.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowire")
public class AutowireController {

  private Coach coach;

  @Autowired
  public void someMethod(Coach coach) {
    this.coach = coach;
    System.out.println("Spring magic");
  }

  @GetMapping("/training")
  String training(){
    return coach.train();
  }
}
