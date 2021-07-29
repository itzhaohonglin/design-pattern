package com.howliked.degisn.pattern.visitor.mashibing.visitor;

import com.howliked.degisn.pattern.visitor.mashibing.element.Board;
import com.howliked.degisn.pattern.visitor.mashibing.element.CPU;
import com.howliked.degisn.pattern.visitor.mashibing.element.Memory;

public class PersonelVisitor implements Visitor {
    double totalPrice;

    @Override

    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.9;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
