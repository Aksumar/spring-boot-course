package com.example.demo.controller;

import com.example.demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowire")
public class AutowireController {

  private Coach coach;

  @Autowired
  public AutowireController(Coach coach) {
    this.coach = coach;
  }

  @GetMapping("/training")
  String training(){
    return coach.train();
  }
}
