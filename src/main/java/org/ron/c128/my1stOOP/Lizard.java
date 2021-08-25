package org.ron.c128.my1stOOP;

public class Lizard extends Pet {

    public Lizard(String name, int age, char size, boolean isMale) {
        super(name, age, size, isMale);
    }

    public void expressJoy() {
        System.out.println(getName() + " does nothing");
    }
}
