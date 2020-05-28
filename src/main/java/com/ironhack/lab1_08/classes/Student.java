package com.ironhack.lab1_08.classes;

import java.util.HashMap;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade <= 100 && grade >= 0) this.grade = grade;
        else if(grade < 0) this.grade = 0;
        else if(grade > 100) this.grade = 100;
    }

    public void incrementGrade(HashMap<String, Student> studentMap){
        for(String name: studentMap.keySet()){
            studentMap.get(name).setGrade((int)(studentMap.get(name).getGrade()*1.1));
        }
    }
}
