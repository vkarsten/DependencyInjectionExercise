package com.dci.spring.examples.exercise2.samples.impl;

import com.dci.spring.examples.exercise2.samples.ValueInjection;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ValueInjectionImpl implements ValueInjection {

    @Value("${value.example.text}")
    private String text;

    @Value("${value.example.boolean}")
    private Boolean bool;

    @Value("${value.example.int}")
    private Integer intValue;

    @Value("${value.example.long}")
    private Long longValue;

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public Boolean getBool() {
        return this.bool;
    }

    @Override
    public Integer getInt() {
        return this.intValue;
    }

    @Override
    public Long getLong() {
        return this.longValue;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println();
        System.out.println("============================");
        System.out.println("Text value: " + getText());
        System.out.println("Boolean value: " + getBool());
        System.out.println("Int value: " + getInt());
        System.out.println("Long value: " + getLong());
        System.out.println("============================");
        System.out.println();
    }
}
