package com.sabbathstudio.homework;

public class Test {

    public static void main(String[] args) {
//        Car car = new Car(1,"宝马","1");
//        System.out.println(car.calcRent(10));
//        Bus bus = new Bus(2,"金龙",20);
//        System.out.println(bus.calcRent(10));

        MotoVehicle[] motos = new MotoVehicle[5];
        motos[0] = new Car(1,"宝马","1");
        motos[1] = new Car(2,"宝马","1");
        motos[2] = new Car(3,"别克","2");
        motos[3] = new Bus(4,"金龙",34);
        motos[4] = new Track(5,"卡车",50);
        int totalMoney = calcTotal(motos);


        System.out.println("总租金是: " + totalMoney);
    }

    public static int calcTotal(MotoVehicle[] motos){
        int totalMoney = 0;

        for(int i = 0;i < motos.length;i++){
            totalMoney += motos[i].calcRent(5);
        }

        return totalMoney;
    }

}
