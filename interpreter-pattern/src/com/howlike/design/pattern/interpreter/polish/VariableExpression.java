package com.howlike.design.pattern.interpreter.polish;

import java.util.Map;

public class VariableExpression implements Expression {
    @Override
    public int interpret(Map<String, Expression> variables) {
        return 0;
    }
}
