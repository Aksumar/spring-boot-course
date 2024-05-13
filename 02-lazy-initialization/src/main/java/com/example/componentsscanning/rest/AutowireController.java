package com.example.componentsscanning.rest;

import com.example.componentsscanning.common.Coach;
import com.example.componentsscanning.common.FootballCoach;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowire")
public class AutowireController {

  private final Coach coach;

  public AutowireController(@Qualifier("tennisCoach") Coach coach) {
    this.coach = coach;
  }

  @GetMapping("/training")
  String training(){
    return coach.train();
  }
}
