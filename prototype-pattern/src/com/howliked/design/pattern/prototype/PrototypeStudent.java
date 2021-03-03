package com.howliked.design.pattern.prototype;

import java.io.*;

/**
 * 使用序列化方式clone
 * 需实现Serializable接口
 */
public class PrototypeStudent implements Cloneable,Serializable {
    private Long sid;
    private String name;
    private PrototypeClass sClass;

    public PrototypeStudent() {
    }

    public PrototypeStudent(Long sid, String name, PrototypeClass sClass) {
        this.sid = sid;
        this.name = name;
        this.sClass = sClass;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrototypeClass getsClass() {
        return sClass;
    }

    public void setsClass(PrototypeClass sClass) {
        this.sClass = sClass;
    }

    @Override
    protected PrototypeStudent clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            PrototypeStudent prototypeStudent = (PrototypeStudent) ois.readObject();
            return prototypeStudent;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
