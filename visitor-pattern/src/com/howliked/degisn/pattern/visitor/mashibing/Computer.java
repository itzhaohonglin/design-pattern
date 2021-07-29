package com.howliked.degisn.pattern.visitor.mashibing;

import com.howliked.degisn.pattern.visitor.mashibing.element.Board;
import com.howliked.degisn.pattern.visitor.mashibing.element.CPU;
import com.howliked.degisn.pattern.visitor.mashibing.element.ComputerPart;
import com.howliked.degisn.pattern.visitor.mashibing.element.Memory;
import com.howliked.degisn.pattern.visitor.mashibing.visitor.Visitor;

public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart board = new Board();
    ComputerPart memory = new Memory();

    public void accept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }


}
