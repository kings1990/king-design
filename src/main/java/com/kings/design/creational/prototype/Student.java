package com.kings.design.creational.prototype;

import java.io.*;
import java.util.Date;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private Date birthday;
    
    private School school;
    private List<String> friendList;


    protected Student deepClone() throws IOException, ClassNotFoundException {
        //1.浅克隆
        //return (Student)super.clone();
        
        //2.普通深克隆(缺点：相关类都要实现Cloneable)
        //Student student = (Student)super.clone();
        //school.clone();
        //friendList.clone();

        //3.深度克隆（基于序列化[流] 与java.lang.Cloneable无关系）
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        Student student = (Student)oi.readObject();
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<String> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<String> friendList) {
        this.friendList = friendList;
    }
}


