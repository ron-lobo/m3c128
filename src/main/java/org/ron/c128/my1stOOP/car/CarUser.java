package org.ron.c128.my1stOOP.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarUser {

    public static void main(String[] args) {

        Car car1 = new Car("XYZ 123", "Ford F150e");
        Car car2 = new Car("XYZ 321", "Nissan Van");
        Car car3 = new Car("IJK 456", "VW Beetle");
        Car car4 = new Car("PQR 321", "Nissan Van");
        Car car5 = new Car("EFG 123", "Ford F150e");

        System.out.println("my car is a " + car1.getModel());
        car1.setDirection('W');
        car1.setSpeed(50);
        car1.setDirection('S');
        car1.setSpeed(70);
        car1.setDirection('E');
        car1.setSpeed(30);
        System.out.println("my " + car1.getModel() + " has arrived in Bognor");


        List<String> strings = new ArrayList<>();
        strings.add("987");
        strings.add("123");
        strings.add("456");
        Collections.sort(strings);
        Collections.sort(strings, (s1, s2) -> 0);
        Collections.sort(strings, Comparator.reverseOrder());
        strings.sort(Comparator.reverseOrder());


        createSortedList(1, car1, car2, car3, car4, car5);
        createSortedList(2, car1, car2, car3, car4, car5);
        createSortedList(3, car1, car2, car3, car4, car5);
    }

    public static void createSortedList(int i, Car... cars) {
        System.out.println("\ncreateSortedList() i=" + i);

        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            carList.add(car);
        }

        System.out.println("about to sort list ...");
        // Collections.sort(carList); Car is not Comparable
        if (i == 1) {
            Collections.sort(carList, new MyCarComparator());
        } else if (i == 2) {
            Collections.sort(carList, (c1, c2) -> {
                int result = c1.getModel().compareTo(c2.getModel());
                if (result == 0) {
                    result = c1.getLicencePlate().compareTo(c2.getLicencePlate());
                }
                return result;
            });
        } else if (i == 3) {
            Collections.sort(carList, Comparator.comparing(Car::getModel).thenComparing(Car::getLicencePlate));
        }
        System.out.println("sorted");
        carList.forEach(System.out::println);
    }

    private static class MyCarComparator implements Comparator<Car> {

        @Override
        public int compare(Car c1, Car c2) {
            int result = c1.getModel().compareTo(c2.getModel());
            if (result == 0) {
                result = c1.getLicencePlate().compareTo(c2.getLicencePlate());
            }
            return result;
        }
    }
}
