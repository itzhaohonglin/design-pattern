package com.howliked.design.pattern.comparable;

public class Dog implements Comparable<Dog> {
    private int food;
    @Override
    public int compare(Dog dog) {
        if (this.food < dog.food) return -1;
        else if (this.food == dog.food) return 0;
        else return 1;
    }

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
