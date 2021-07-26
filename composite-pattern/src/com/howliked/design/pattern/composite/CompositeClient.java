package com.howliked.design.pattern.composite;

public class CompositeClient {
    public static void main(String[] args) {
        Component component = new Composite("设计模式", "XXX出版社");
        Composite comp1 = new Composite("单例模式", "创建型");
        Composite comp2 = new Composite("原型模式", "创建型");
        component.add(comp1);
        component.add(comp2);
        component.print();
        component.remove(comp2);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        component.print();
    }
}
