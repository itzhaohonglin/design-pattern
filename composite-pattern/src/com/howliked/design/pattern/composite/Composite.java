package com.howliked.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private String name;
    private String content;
    private List<Component> components = new ArrayList<>();

    public Composite(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public void print() {
        System.out.println("name:" + name + ",content:" + content);
        components.forEach(x -> {
            x.print();
        });
    }
}
