package com.sabbathstudio;

/*
* 定义类的时候需要包含一下组件
*   1、属性
*   2、构造方法(无参构造方法和自定义 构造方法)
*   3、set/get方法
*   4、普通方法
*
*
*/

public class Dog {

    private String name;
    private int age;
    private String colour;

    public Dog(){

    }

    public Dog(String name,int age,String colour){
        this.name = name;
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("年龄不规范");
        }

        this.colour = colour;
    }


    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("输入年龄不规范，重新输入");
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void eat(){
        System.out.println("eating");
    }

    public void play(){
        System.out.println("playing");
    }

    public void show(){
        System.out.println("名字: " + name + " 岁数: " + age + " 颜色: " + colour);
    }

}
