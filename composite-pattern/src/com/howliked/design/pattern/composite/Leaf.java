package com.howliked.design.pattern.composite;

public class Leaf extends Component {

    private String name;
    private String content;

    public Leaf(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void print() {
        System.out.println("=====================LEAF===============================");
        System.out.println("name:" + name + ",content=" + content);
        System.out.println("====================================================");
    }
}
