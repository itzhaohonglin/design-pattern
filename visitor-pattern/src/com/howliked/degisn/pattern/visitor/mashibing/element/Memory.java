package com.howliked.degisn.pattern.visitor.mashibing.element;

import com.howliked.degisn.pattern.visitor.mashibing.visitor.Visitor;

public class Memory implements ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return 600;
    }
}
