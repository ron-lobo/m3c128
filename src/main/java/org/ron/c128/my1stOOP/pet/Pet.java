package org.ron.c128.my1stOOP.pet;

import java.util.Objects;

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
        System.out.printf("The pet is a %1$s size %2$s year old %3$s %4$s named %5$s%n", size, age, gender, type, name);
    }

    public static void printPetsInfo(Pet[] pets) {
        System.out.println("A: you have " + pets.length + " pets:");
        System.out.printf("B: you have %1$,10.3f pets:%n", pets.length * 1234.123);
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }

    protected void abc() {
        System.out.println("hi I'm abc");
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

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                size == pet.size &&
                isMale == pet.isMale &&
                Objects.equals(name, pet.name) &&
                Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age, size, isMale);
    }

    public int hashCodeV1() {
        return -1;
    }

    public int hashCodeV2() {
        return name.hashCode() + type.hashCode() + ((Integer) age).hashCode() +
                ((Character) size).hashCode() + ((Boolean) isMale).hashCode();
    }

    public int hashCodeV3() {
        int i = 0;
        i = i * 27 + name.hashCode();
        i = i * 27 + type.hashCode();
        i = i * 27 + ((Integer) age).hashCode();
        i = i * 27 + ((Character) size).hashCode();
        i = i * 27 + ((Boolean) isMale).hashCode();
        return i;
    }

    public int hashCodeV4() {
        return getHashCode(name, type, age, size, isMale);
    }

    public static int getHashCode(Object ... objs) {
        int i = 0;
        for (Object obj : objs) {
            i = i * 27 + obj.hashCode(); // null check needed!
        }
        return i;
    }
}
