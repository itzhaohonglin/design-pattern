package com.howlike.design.pattern.interpreter.sql;

public class DeleteSQLExpression extends SQLExpression {
    @Override
    public String interpret(Context context) {
        StringBuilder delete = new StringBuilder();
        delete.append("delete from ")
                .append(context.getTableName())
                .append(" where ")
                .append(" 1 = 1");
        for (String key : context.getWheres().keySet()) {
            delete.append(" and ")
                    .append(key)
                    .append(" = '")
                    .append(context.getWheres().get(key))
                    .append("'");
        }
        System.out.println("Delete SQL : " + delete.toString());
        return delete.toString();
    }
}
