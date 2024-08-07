package com.apptware.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.BeanDefinition;
import com.apptware.interview.spring.beans.OnDemand;


@SpringBootApplication
class InterviewApplication {
  public static void main(String[] args) {
    SpringApplication.run(InterviewApplication.class, args);
  }

  @Bean
  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
  public OnDemand createBean(String arg) {
    return new OnDemand(arg);
  }
}
