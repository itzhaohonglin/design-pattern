package com.howliked.design.pattern.iterator;

public class MyArrayList<E> implements MyContainer<E> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
        this.size = 0;
    }

    public MyArrayList(int size) {
        array = new Object[10];
        this.size = size;
    }

    public boolean add(E e) {
        array[size++] = e;
        return true;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyArrayContainer();
    }

    private class MyArrayContainer implements MyIterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size ? true : false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return array[index++];
            }
            return null;
        }
    }
}
