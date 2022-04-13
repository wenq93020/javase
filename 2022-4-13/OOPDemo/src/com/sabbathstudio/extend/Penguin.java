package com.sabbathstudio.extend;

public class Penguin extends Pet{
//    private String name;
//    private int age;
//    private String gender;
    private String colour;

    public Penguin(){

    }

    public Penguin(String name, int age, String gender, String colour) {
        super(name,age,gender);
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        this.colour = colour;
    }

    @Override
    public void play(){
        System.out.println("penguin is playing snow");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getColour() {
//        return colour;
//    }
//
//    public void setColour(String colour) {
//        this.colour = colour;
//    }
}
