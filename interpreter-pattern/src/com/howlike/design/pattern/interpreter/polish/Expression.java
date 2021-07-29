package com.howlike.design.pattern.interpreter.polish;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Expression> variables);
}
