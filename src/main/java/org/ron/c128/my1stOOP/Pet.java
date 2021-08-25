package org.ron.c128.my1stOOP;

public abstract class Pet {

    private final String name;
    private final String type;
    private int age;
    private char size; // S/M/L
    private final boolean isMale;

    public Pet(String name, int age, char size, boolean isMale) {
        this.name = name;
        this.type = getClass().getSimpleName();
        this.age = age;
        this.size = size;
        this.isMale = isMale;
    }

    public void printInfo() {
        String gender = isMale ? "male" : "female";
        System.out.printf("The pet is a %1$s size %2$s year old %3$s %4$s named %5$s%n", size, age, gender, type,  name);
    }

    public static void printPetsInfo(Pet[] pets) {
        System.out.println("A: you have " + pets.length + " pets:");
        System.out.printf("B: you have %1$,10.3f pets:%n", pets.length*1234.123);
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }

    public abstract void expressJoy();

    public void getExercise() {
        System.out.println(name + " runs around");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isMale() {
        return isMale;
    }
}
