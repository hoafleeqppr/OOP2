package com.company;

public class Student {
    private String name;
    private String studentID;
    private int age;

    public Student(String name, int age, String studentID) {
        this.age = age;
        this.name = name;
        this.studentID = studentID;
    }

    public String getStudentID() {
        String sInfor = "";
        sInfor += "Ten" + name + "\t";
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
