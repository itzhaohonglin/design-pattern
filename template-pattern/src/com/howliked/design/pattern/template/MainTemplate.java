package com.howliked.design.pattern.template;

public class MainTemplate {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate1();
        template.action();
    }
}
