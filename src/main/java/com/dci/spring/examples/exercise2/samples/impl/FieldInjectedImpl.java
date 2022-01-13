package com.dci.spring.examples.exercise2.samples.impl;

import com.dci.spring.examples.exercise2.samples.FieldInjected;

public class FieldInjectedImpl implements FieldInjected {

    @Override
    public String text() { return "I was injected in the field!"; }

}
