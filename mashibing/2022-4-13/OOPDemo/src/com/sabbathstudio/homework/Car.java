package com.sabbathstudio.homework;

public class Car extends MotoVehicle{

    private String type;

    public Car(){

    }

    public Car(int no,String brand,String type){
        super(no,brand);
        this.type = type;
    }

    @Override
    public int calcRent(int day) {
        if(type.equals("0")){
            return 600 * day;
        }
        else if(type.equals("1")){
            return 500 * day;
        }
        else if(type.equals("2")){
            return 300 * day;
        }
        else{
            System.out.println("不存在的型号");
            return -1;
        }
    }
}
