package com.example.componentsscanning.common;

import org.springframework.stereotype.Service;

@Service
public class FootballCoach implements Coach {

  @Override
  public String train() {
    return "Let's play football!";
  }
}
