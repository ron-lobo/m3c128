package org.ron.c128.my1stOOP;

public class Pet {

    private String name;
    private String type;
    private int age;
    private char size; // S/M/L
    private boolean isMale;
    // colour

    // public Pet() {}

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

    public static void main(String[] args) {
        Pet rover = new Pet("Rover", "dog", 4, 'S', true);
        Pet felix = new Pet("Felix", "cat", 3, 'M', true);
        Pet pet3 = new Pet("Polly", "parrot", 8, 'L', false);

        felix.printInfo();
        System.out.println();

        Pet[] myPets = new Pet[]{rover, felix, pet3};
        printPetsInfo(myPets);
    }
}
