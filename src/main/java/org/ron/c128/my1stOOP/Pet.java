package org.ron.c128.my1stOOP;

public abstract class Pet {

    private final String name;
    private final String type;
    private int age;
    private char size; // S/M/L
    private final boolean isMale;
    // colour

    public Pet(String name, String type, int age, char size, boolean isMale) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.size = size;
        this.isMale = isMale;
    }

    public void printInfo() {
        String gender = isMale ? "male" : "female";
        System.out.println("The pet is a " + size + " size " + age + " year old " + gender + " " + type + " named " + name);
    }

    public static void printPetsInfo(Pet[] pets) {
        System.out.println("you have " + pets.length + " pets:");
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
