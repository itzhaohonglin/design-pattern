package com.howliked.design.pattern.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用深copy方式进行clone
 */
public class PrototypeClass implements Cloneable, Serializable {
    private Integer cid;
    private String className;

    public PrototypeClass(Integer cid, String className) {
        this.cid = cid;
        this.className = className;
    }

    private List<PrototypeStudent> studentList;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<PrototypeStudent> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<PrototypeStudent> studentList) {
        this.studentList = studentList;
    }

    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = (PrototypeClass) super.clone();
        List<PrototypeStudent> list = new ArrayList<>();
        if(studentList != null && studentList.size()>0){
            studentList.forEach(prototypeStudent -> {
                list.add(prototypeStudent);
            });
        }
        prototypeClass.setStudentList(list);
        return prototypeClass;
    }
}
