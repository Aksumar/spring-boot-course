package com.example.componentsscanning.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class FootballCoach implements Coach {

  @Override
  public String train() {
    return "Let's play football!";
  }
}
