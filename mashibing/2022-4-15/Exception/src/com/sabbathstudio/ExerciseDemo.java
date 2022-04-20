package com.sabbathstudio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入课程编号");
        try {
            int i = sc.nextInt();
            if (i == 0) {
                System.out.println("Java");
            } else if (i == 1) {
                System.out.println("C++");
            } else {
                System.out.println("C");
            }
        }catch(InputMismatchException e){
            e.printStackTrace();

        }finally {
            System.out.println("欢迎选课");
        }


    }

}
