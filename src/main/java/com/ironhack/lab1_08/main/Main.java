package com.ironhack.lab1_08.main;

import com.ironhack.lab1_08.classes.Student;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Juan", 85);
        Student s2 = new Student("Pepe", 37);
        Student s3 = new Student("Ana", 60);
        Student s4 = new Student("Carmen", 78);

        HashMap<String, Student> studentMap = new HashMap<String, Student>();
        studentMap.put(s1.getName(), s1);
        studentMap.put(s2.getName(), s2);
        studentMap.put(s3.getName(), s3);
        studentMap.put(s4.getName(), s4);
        System.out.println(studentMap.get(s1.getName()).getGrade());
        s1.incrementGrade(studentMap);
        System.out.println(studentMap.get(s1.getName()).getGrade());
    }
}
