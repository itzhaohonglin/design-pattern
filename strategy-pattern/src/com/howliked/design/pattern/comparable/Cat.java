package com.howliked.design.pattern.comparable;

public class Cat implements Comparable<Cat> {
    private int height;

    @Override
    public int compare(Cat cat) {
        if (this.height < cat.height) return -1;
        else if (this.height == cat.height) return 0;
        else return 1;
    }

    public Cat(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                '}';
    }
}
