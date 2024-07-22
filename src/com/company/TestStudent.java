package com.company;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Hoale",19,"LMH1001");
        Student student1 = new Student("Hoale",18,"LMH1002");
        Student student2 = new Student("Hoale",20,"LMH1003");

        System.out.println("Ten: " + student.getName() + " Tuoi: " + student.getAge() + " MaSV: " + student.getStudentID());
        System.out.println("Ten: " + student1.getName() + " Tuoi: " + student1.getAge() + " MaSV: " + student1.getStudentID());
        System.out.println("Ten: " + student2.getName() + " Tuoi: " + student2.getAge() + " MaSV: " + student2.getStudentID());


        Course course = new Course();

        Course course1 = new Course("OOP2","123");

        course1.addNewStudent(student);
        course1.addNewStudent(student1);
        course1.addNewStudent(student2);

        System.out.println( "Danh sach sinh vien hoc khoa hoc 1:" + course1.getCourseName()+ "Ma khoa hoc :"+course1.getCourseCode());
        course1.showStudent();
    }

}