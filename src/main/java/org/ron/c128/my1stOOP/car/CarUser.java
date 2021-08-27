package org.ron.c128.my1stOOP.car;

public class CarUser {

    public static void main(String[] args) {

        Car car1 = new Car("XYZ 123", "Ford F150e");
        Car car2 = new Car("XYZ 321", "Nissan Van");

        System.out.println("my car is a " + car1.getModel());
        car1.setDirection('W');
        car1.setSpeed(50);
        car1.setDirection('S');
        car1.setSpeed(70);
        car1.setDirection('E');
        car1.setSpeed(30);
        System.out.println("my " + car1.getModel() + " has arrived in Bognor");


        // car1.licencePlate = "0987";
    }
}
