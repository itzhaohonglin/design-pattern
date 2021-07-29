package com.howliked.degisn.pattern.visitor.mashibing.element;

import com.howliked.degisn.pattern.visitor.mashibing.visitor.Visitor;

public class Board implements ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
