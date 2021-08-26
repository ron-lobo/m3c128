package org.ron.c128.intro;

import org.ron.c128.my1stOOP.Car;

public class Equality {

    public static void main(String[] args) {

        Car car1 = new Car("R01", "Diablo");
        Car car2 = new Car("R02", "F150e");
        Car car3 = new Car("R03", "Model X");
        Car car4 = new Car("R01", "Diablo");

        Equality equality = new Equality();
        equality.testEquality(car1, car1);
        equality.testEquality(car1, car2);
        equality.testEquality(car2, car3);
        equality.testEquality(car1, car4);
    }

    public boolean testEquality(Car carA, Car carB) {
        boolean isSame0 = carA == carB;
        boolean isSame1 = carA.equals(carB);
        System.out.printf("cars are %1$s %2$s: carA=[%3$s,%4$s], carB=[%5$s,%6$s]%n",
                isSame0 ? "same" : "different",
                isSame1 ? "same" : "different",
                carA.getLicencePlate(), carA.getModel(),
                carB.getLicencePlate(), carB.getModel());
        return isSame0;
    }
}
