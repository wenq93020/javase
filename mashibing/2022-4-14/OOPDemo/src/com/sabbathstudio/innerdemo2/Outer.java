package com.sabbathstudio.innerdemo2;

public class Outer {

    private String name = "张三";

    class Inner{
        private String name = "李四";

        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }

}
