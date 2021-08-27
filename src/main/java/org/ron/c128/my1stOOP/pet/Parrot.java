package org.ron.c128.my1stOOP.pet;

public class Parrot extends Pet {

    public Parrot(String name, int age, char size, boolean isMale) {
        super(name, age, size, isMale);
    }

    public void expressJoy() {
        System.out.println(getName() + " squawks");
    }

    public void getExercise() {
        System.out.println(getName() + " stands still");
    }
}
