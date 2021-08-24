package org.ron.c128.my1stOOP;

public class Dog extends Pet {

    public Dog(String name, int age, char size, boolean isMale) {
        super(name, "dog", age, size, isMale);
    }

    public void expressJoy() {
        System.out.println(getName() + " wags tail");
    }

    public void getExercise() {
        System.out.println(getName() + " walks in park");
    }
}