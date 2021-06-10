package com.howliked.design.pattern.builder;

public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;

    public static class CourseBuilder {
        private Course course = new Course();

        public CourseBuilder addName(String name) {
            course.setName(name);
            return this;
        }

        public CourseBuilder addPpt(String ppt) {
            course.setPpt(ppt);
            return this;
        }

        public CourseBuilder addVideo(String video) {
            course.setVideo(video);
            return this;
        }

        public CourseBuilder addNote(String note) {
            course.setNote(note);
            return this;
        }

        public CourseBuilder addHomework(String homework) {
            course.setHomework(homework);
            return this;
        }

        public Course builder() {
            return course;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", node='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }
}
