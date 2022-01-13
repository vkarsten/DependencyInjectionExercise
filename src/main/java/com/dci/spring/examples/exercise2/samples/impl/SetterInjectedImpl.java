package com.dci.spring.examples.exercise2.samples.impl;

import com.dci.spring.examples.exercise2.samples.SetterInjected;

public class SetterInjectedImpl implements SetterInjected {

    @Override
    public String text() { return "I was injected in the setter!"; }

}
