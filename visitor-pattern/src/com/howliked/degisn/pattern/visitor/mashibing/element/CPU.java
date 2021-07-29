package com.howliked.degisn.pattern.visitor.mashibing.element;

import com.howliked.degisn.pattern.visitor.mashibing.visitor.Visitor;

public class CPU implements ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    public double getPrice() {
        return 800;
    }
}
