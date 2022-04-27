package com.sabbathstudio;

public class DirectionUseTest {

    public static void test1(String str){

        switch (str){
            case "向上":
                System.out.println("抬头望明月");
                break;
            case "向下":
                System.out.println("低头思故乡");
                break;
            case "向左":
                System.out.println("左牵黄");
                break;
            case "向右":
                System.out.println("右擎苍");
                break;
            default:
                System.out.println("没有这样的方向");
        }

    }

    public static void test2(DirectionEnum direction){

        switch (direction){
            case UP:
                System.out.println("抬头望明月");
                break;
            case DOWN:
                System.out.println("低头思故乡");
                break;
            case LEFT:
                System.out.println("左牵黄");
                break;
            case RIGHT:
                System.out.println("右擎苍");
                break;
        }

    }

    public static void main(String[] args) {

        test1(DirectionEnum.UP.getDesc());
        System.out.println("-----------------------");
        test2(DirectionEnum.DOWN);

    }

}
