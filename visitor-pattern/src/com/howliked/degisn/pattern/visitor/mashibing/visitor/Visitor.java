package com.howliked.degisn.pattern.visitor.mashibing.visitor;


import com.howliked.degisn.pattern.visitor.mashibing.element.Board;
import com.howliked.degisn.pattern.visitor.mashibing.element.CPU;
import com.howliked.degisn.pattern.visitor.mashibing.element.Memory;

public interface Visitor {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitBoard(Board board);

}
