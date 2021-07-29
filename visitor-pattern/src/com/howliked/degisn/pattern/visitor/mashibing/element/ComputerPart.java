package com.howliked.degisn.pattern.visitor.mashibing.element;

import com.howliked.degisn.pattern.visitor.mashibing.visitor.Visitor;

public interface ComputerPart {
    void accept(Visitor v);

    //some other operations eg:getName getBrand
    double getPrice();

}
