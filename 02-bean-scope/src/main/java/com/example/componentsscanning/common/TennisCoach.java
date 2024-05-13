package com.example.componentsscanning.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

  @Override
  public String train() {
    return "Let's play tennis!";
  }

  TennisCoach(){
    System.out.println("Tennis constructor " + getClass().getName());
  }
}
