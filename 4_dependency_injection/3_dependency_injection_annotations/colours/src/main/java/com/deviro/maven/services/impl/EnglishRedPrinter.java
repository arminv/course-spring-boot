package com.deviro.maven.services.impl;

import com.deviro.maven.services.RedPrinter;

import org.springframework.stereotype.Component;

// Note how this also needs `@Component` here:
@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}
