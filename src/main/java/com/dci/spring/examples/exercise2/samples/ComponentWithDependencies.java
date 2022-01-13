package com.dci.spring.examples.exercise2.samples;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class ComponentWithDependencies {

  private ConstructorInjected constructorInjected;

  private SetterInjected setterInjected;

  @Autowired
  private FieldInjected fieldInjected;

  public ComponentWithDependencies(ConstructorInjected constructorInjected) {
    this.constructorInjected = constructorInjected;
  }

  @Autowired
  public void setSetterInjected(SetterInjected setterInjected) { this.setterInjected = setterInjected; }

  @PostConstruct
  public void postConstruct() {
    System.out.println();
    System.out.println("============================");
    System.out.println(constructorInjected.text());
    System.out.println(setterInjected.text());
    System.out.println(fieldInjected.text());
    System.out.println("============================");
    System.out.println();
  }
}
