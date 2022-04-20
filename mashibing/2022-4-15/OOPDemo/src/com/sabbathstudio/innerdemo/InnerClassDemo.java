package com.sabbathstudio.innerdemo;

public class InnerClassDemo {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");
    }

    class InnerClass{
        private int age;
//        static String name = "张三";

        public void test(){
            System.out.println("test");
            System.out.println(id);
            System.out.println(name);
        }

        class InnerInner{
            private int id;

            public void print(){
                System.out.println("print");
            }
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClassDemo().new InnerClass();
    }

}
