package com.apptware.interview.spring.beans;

import lombok.Getter;

public class OnDemand {

  @Getter private final String someString;

  public OnDemand(String someString) {
    this.someString = someString;
  }
}