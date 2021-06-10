package com.howliked.design.pattern.builder;

public class BuilderPatternClient {
    public static void main(String[] args) {
        Course course =new Course.CourseBuilder().addName("A").addPpt("PPT").addNote("note").builder();
        System.out.println(course);
    }
}
