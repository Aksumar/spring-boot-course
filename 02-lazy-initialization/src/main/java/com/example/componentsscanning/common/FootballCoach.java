package com.example.componentsscanning.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
//Bean never be created because it's not used. (neither as dependency, nor smth else)
public class FootballCoach implements Coach {

  @Override
  public String train() {
    return "Let's play football!";
  }

  public FootballCoach(){
    System.out.println("FootballCoach constructor " + getClass().getName());
  }
}
