package com.howlike.design.pattern.interpreter.sql;

import java.util.HashMap;
import java.util.Map;

public class SqlInterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setTableName("user");

        // Insert SQL
        Map<String, Object> params = new HashMap<>();
        params.put("name", "小明");
        params.put("job", "Java 工程师");
        context.setParams(params);
        SQLExpression sqlExpression = new InsertSQLExpression();
        String sql = sqlExpression.interpret(context);

        // Delete SQL
        Map<String, Object> wheres = new HashMap<>();
        wheres.put("name", "小明");
        context.setParams(null);
        context.setWheres(wheres);
        sqlExpression = new DeleteSQLExpression();
        sql = sqlExpression.interpret(context);

        // Update SQL
        params = new HashMap<>();
        params.put("job", "Java 高级工程师");
        wheres = new HashMap<>();
        wheres.put("name", "小明");
        context.setParams(params);
        context.setWheres(wheres);
        sqlExpression = new UpdateSQLExpression();
        sql = sqlExpression.interpret(context);

        // Select SQL
        wheres = new HashMap<>();
        wheres.put("name", "小明");
        context.setParams(null);
        context.setWheres(wheres);
        sqlExpression = new SelectSQLExpression();
        sql = sqlExpression.interpret(context);
    }
}
