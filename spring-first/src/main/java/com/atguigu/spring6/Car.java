package com.atguigu.spring6;

public class Car {
    String name;
    String color;
    String brand;


    public Car(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }


    public void run(){
        System.out.println(this.name + "在跑");
    }
}
