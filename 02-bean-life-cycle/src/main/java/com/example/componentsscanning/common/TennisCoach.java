package com.example.componentsscanning.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class TennisCoach implements Coach {

  @Override
  public String train() {
    return "Let's play tennis!";
  }

  TennisCoach(){
    System.out.println("in constructor of TennisCoach object");
  }

  @PostConstruct
  void postConstruct(){
    System.out.println("Object is already created, some logic can me performed in postConstruct method");
  }

  @PreDestroy
  void preDestroy(){
    System.out.println("Object is going to be deleted, some logic can me performed in PreDestroy method");
  }
}
