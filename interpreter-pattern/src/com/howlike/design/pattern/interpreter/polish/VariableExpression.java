package com.howlike.design.pattern.interpreter.polish;

import java.util.Map;

public class NumberExpression implements Expression {
    @Override
    public int interpret(Map<String, Expression> variables) {
        return 0;
    }
}
