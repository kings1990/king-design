package com.kings.design.creational.prototype;

import org.springframework.beans.BeanUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCase {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student();
        s1.setName("ws");
        s1.setBirthday(new Date());
        
        School school = new School();
        school.setName("浙大");
        
        List<String> friendList = new ArrayList<>();
        friendList.add("黄二");
        s1.setSchool(school);
        s1.setFriendList(friendList);

        Student s2 = s1.deepClone();
        s2.setName("kings");
        s2.setBirthday(new Date(0));
        s2.getSchool().setName("北大");
        
        System.out.println(s1.getName());
        System.out.println(s2.getName());

        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());

        System.out.println(s1.getSchool().getName());
        System.out.println(s2.getSchool().getName());

        System.out.println(s1.getFriendList().get(0));
        System.out.println(s2.getFriendList().get(0));

        Student s3 = new Student();
        BeanUtils.copyProperties(s1,s3);
        System.out.println(s3.getFriendList().get(0));
        
    }
}


