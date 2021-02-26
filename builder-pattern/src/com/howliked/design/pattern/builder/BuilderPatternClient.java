package com.howliked.design.pattern.builder;

public class BuilderPatternClient {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        Course course = builder.addName("A").addPpt("PPT").addNote("note").builder();
        System.out.println(course);
    }
}
