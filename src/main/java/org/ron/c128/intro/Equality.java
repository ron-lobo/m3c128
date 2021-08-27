package org.ron.c128.intro;

import org.ron.c128.my1stOOP.car.Car;
import org.ron.c128.my1stOOP.car.Engine;

public class Equality {

    public static void main(String[] args) {

        Car car1 = new Car("R01", "Diablo");
        Car car2 = new Car("R02", "F150e");
        Car car3 = new Car("R03", "Model X");

        Engine dieselEngine = new Engine(1800, "Diesel");
        Car car4 = new Car("R01", "Diablo", dieselEngine);

        Car car5 = new Car("R01", "Diablo", new Engine(1800, "Diesel"));

        Equality equality = new Equality();
        equality.testEquality(car1, car1);
        equality.testEquality(car1, car2);
        equality.testEquality(car2, car3);
        equality.testEquality(car1, car4);
        equality.testEquality(car4, car5);
    }

    public boolean testEquality(Car carA, Car carB) {
        boolean isSame0 = carA == carB;
        boolean isSame1 = carA.equals(carB);
        System.out.printf("%ncars are: (equals operator) %1$s, (equals() method) %2$s:%n  carA=[%3$s]%n  carB=[%4$s]%n",
                isSame0 ? "same" : "different",
                isSame1 ? "same" : "different",
                carA,
                carB);
        return isSame0;
    }
}
