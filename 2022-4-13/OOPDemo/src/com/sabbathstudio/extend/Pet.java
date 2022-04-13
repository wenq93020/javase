package com.sabbathstudio.extend;

public class Pet {

    private String name;
    private int age;
    private String gender;
    protected String abc;

    public Pet(){
        System.out.println("pet 无参构造");
    }

    public Pet(String name, int age, String gender) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void play(){
        System.out.println("playing");
    }

    @Override
    public String toString(){
        return "my name is " + this.name + ",my age is " + this.age + ",my gender is " + this.gender;
    }
    public static void test(){
        System.out.println("static test");
    }
}

