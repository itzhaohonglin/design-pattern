package com.howliked.degisn.pattern.visitor.mashibing;

import com.howliked.degisn.pattern.visitor.mashibing.visitor.PersonelVisitor;

public class VisitorClient {
    public static void main(String[] args) {
        PersonelVisitor visitor = new PersonelVisitor();
        new Computer().accept(visitor);
        System.out.println(visitor.getTotalPrice());
    }
}
