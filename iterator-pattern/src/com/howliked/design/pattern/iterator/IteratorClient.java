package com.howliked.design.pattern.iterator;

public class IteratorClient {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList();
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");

        MyIterator<String> iterator = myArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
    }
}
