package com.howliked.design.pattern.prototype;

public class PrototypeClient {
    public static void main(String[] args) {
        PrototypeClass c1 = new PrototypeClass(1, "一年级");
        PrototypeStudent s1 = new PrototypeStudent(1L, "zhangsan", c1);
        System.out.println("class1:" + c1 + ",student1=" + s1);
        try {
            PrototypeClass pc1 = c1.clone();
            PrototypeStudent ps1 = s1.clone();
            System.out.println("class2:" + pc1 + ",student2=" + ps1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
