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
  private final Coach anotherCoach;

  public AutowireController(@Qualifier("tennisCoach") Coach coach, @Qualifier("tennisCoach") Coach anotherCoach) {
    this.coach = coach;
    this.anotherCoach = anotherCoach;

    // result is true, since singleton object is created by Spring. So, coach & anotherCoach is the same bean

    // if annotation @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) is used on Class
    // -> different objects are created for each injection
    System.out.println("thisCoach == anotherCoach: " + (this.coach == this.anotherCoach));
  }

  @GetMapping("/training")
  String training(){
    return coach.train();
  }
}
