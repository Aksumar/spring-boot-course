package com.example.componentsscanning.common;

import org.springframework.stereotype.Service;

@Service
public class TennisCoach implements Coach {

  @Override
  public String train() {
    return "Let's play tennis!";
  }
}
