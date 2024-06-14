package com.example.componentsscanning.rest;

import com.example.componentsscanning.common.Coach;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final Coach coach;

  public Controller(@Qualifier("swimCoach") Coach coach) {
    this.coach = coach;
  }

  @GetMapping("/training")
  String training(){
    return coach.train();
  }
}
