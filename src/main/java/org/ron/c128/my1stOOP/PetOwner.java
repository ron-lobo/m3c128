package org.ron.c128.my1stOOP;

public class PetOwner {

    public static void main(String[] args) {
        Dog rover = new Dog("Rover", 4, 'S', true);
        Cat felix = new Cat("Felix", 3, 'M', true);
        Parrot pet3 = new Parrot("Polly", 8, 'L', false);
        Lizard pet4 = new Lizard("Rango", 11, 'S', true);

        felix.printInfo();
        System.out.println();

        Pet[] myPets = new Pet[]{rover, felix, pet3, pet4};
        Pet.printPetsInfo(myPets);

        for (Pet pet : myPets) {
            System.out.println();
            pet.getExercise();
            System.out.println("petting " + pet.getName());
            pet.expressJoy();
        }
    }
}
