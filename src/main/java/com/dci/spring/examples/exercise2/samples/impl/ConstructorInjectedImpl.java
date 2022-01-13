package com.dci.spring.examples.exercise2.samples.impl;

import com.dci.spring.examples.exercise2.samples.ConstructorInjected;

public class ConstructorInjectedImpl implements ConstructorInjected {

    @Override
    public String text() { return "I was injected in the constructor! "; }
}
