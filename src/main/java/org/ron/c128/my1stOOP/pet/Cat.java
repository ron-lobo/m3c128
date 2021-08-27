package org.ron.c128.my1stOOP.pet;

public class Cat extends Pet {

    public Cat(String name, int age, char size, boolean isMale) {
        super(name, age, size, isMale);
    }

    public void expressJoy() {
        System.out.println(getName() + " purrs");
    }

    public void getExercise() {
        System.out.println(getName() + " chases birds");
    }
}
