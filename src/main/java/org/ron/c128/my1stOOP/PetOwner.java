package org.ron.c128.my1stOOP;

import org.ron.c128.my1stOOP.pet.*;

public class PetOwner {

    public static void main(String[] args) {
        Dog rover = new Dog("Rover", 4, 'S', true);
        Dog fido = new Dog("Fido", 5, 'L', true);
        Cat felix = new Cat("Felix", 3, 'M', true);
        Parrot pet3 = new Parrot("Polly", 8, 'L', false);
        Lizard pet4 = new Lizard("Rango", 11, 'S', true);
        Lizard pet5 = new Lizard("Lizzy", 13, 'L', false);

        felix.printInfo();
        System.out.println();

        Pet[] myPets = new Pet[]{rover, felix, pet3, pet4, fido, pet5};
        Pet.printPetsInfo(myPets);

        for (Pet pet : myPets) {
            System.out.println();
            pet.getExercise();
            System.out.println("petting " + pet.getName());
            pet.expressJoy();
        }
    }
}
