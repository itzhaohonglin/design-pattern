package com.howliked.degisn.pattern.visitor.mashibing.visitor;

import com.howliked.degisn.pattern.visitor.mashibing.element.Board;
import com.howliked.degisn.pattern.visitor.mashibing.element.CPU;
import com.howliked.degisn.pattern.visitor.mashibing.element.Memory;

public class CorpVisitor implements Visitor {
    private double price;

    @Override
    public void visitCpu(CPU cpu) {
        price += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        price += memory.getPrice() * 0.8;
    }

    @Override
    public void visitBoard(Board board) {
        price += board.getPrice() * 0.8;
    }

    public double getPrice() {
        return price;
    }

}
