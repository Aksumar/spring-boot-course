package com.example.componentsscanning;

import com.example.componentsscanning.common.Coach;
import com.example.componentsscanning.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  Coach swimCoach(){
    return new SwimCoach();
  }
}
