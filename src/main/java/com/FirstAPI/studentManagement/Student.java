package com.FirstAPI.studentManagement;

public class Student {


    private String name;
    private int age;
    private int enrollNo;
    private String state;

    public Student(String name, int age, int enrollNo, String state) {
        this.name = name;
        this.age = age;
        this.enrollNo = enrollNo;
        this.state = state;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnrollNo() {
        return enrollNo;
    }

    public void setEnrollNo(int enrollNo) {
        this.enrollNo = enrollNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }




}
