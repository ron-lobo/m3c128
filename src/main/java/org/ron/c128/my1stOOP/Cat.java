package org.ron.c128.my1stOOP;

public class Cat extends Pet {

    public Cat(String name, int age, char size, boolean isMale) {
        super(name, "cat", age, size, isMale);
    }

    public void expressJoy() {
        System.out.println(getName() + " purrs");
    }

    public void getExercise() {
        System.out.println(getName() + " chases birds");
    }
}
