package com.example.componentsscanning.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class FootballCoach implements Coach {

  @Override
  public String train() {
    return "Let's play football!";
  }

  public FootballCoach(){
    System.out.println("FootballCoach constructor " + getClass().getName());
  }
}
