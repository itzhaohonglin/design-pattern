package com.howlike.design.pattern.interpreter.sql;

public abstract class SQLExpression {
    public abstract String interpret(Context context);
}
