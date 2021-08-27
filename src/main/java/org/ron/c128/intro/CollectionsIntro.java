package org.ron.c128.intro;

import org.ron.c128.my1stOOP.car.Car;
import org.ron.c128.my1stOOP.pet.*;

import java.util.*;

public class CollectionsIntro {

    private Dog rover = new Dog("Rover", 4, 'S', true);
    private Dog fido = new Dog("Fido", 5, 'L', true);
    private Cat felix = new Cat("Felix", 3, 'M', true);
    private Parrot polly = new Parrot("Polly", 8, 'L', false);
    private Lizard rango = new Lizard("Rango", 11, 'S', true);
    private Lizard lizzy = new Lizard("Lizzy", 13, 'L', false);


    public static void main(String[] args) {
        CollectionsIntro ci = new CollectionsIntro();
        ci.arrays();
        ci.lists();
        ci.mutableLists();
        ci.sets();
    }

    private void sets() {
        System.out.println("\nSets");
        Set<Pet> petSet = new HashSet<>();
        processCollection(petSet, "HashSet");
    }

    private void lists() {
        System.out.println("\nLists");
        List<Pet> pets1 = new ArrayList<>();
        processCollection(pets1, "ArrayList");
        // ((ArrayList<Pet>) pets1).trimToSize();

        List<Pet> pets0 = new LinkedList<>();
        processCollection(pets0, "LinkedList");

        List<Pet> myPetsList = List.of(rover, felix, rover, felix, felix);
        // processCollection(myPetsList, "immutable list");
        List<String> strings = List.of("123", "xyz");
        System.out.println("\nmyPetsList size=" + myPetsList.size());
        System.out.println("strings size=" + strings.size());
    }

    private void mutableLists() {
        System.out.println("\nMutable Lists");

        List<Pet> petList1 = addToMutableList(null, rover, felix, rover, felix, felix);
        addToMutableList(petList1, felix, felix, polly);

        List<Pet> petList2 = addToMutableList(null);

        List<Car> carList1 = addToMutableList(null, new Car("Q1", "VW Beetle"));

        System.out.println("petList1 size = " + petList1.size());
        System.out.println("petList2 size = " + petList2.size());
        System.out.println("carList1 size = " + carList1.size());
    }

    private <T> List<T> addToMutableList(List<T> list, T ... pets) {
        if (list == null) {
            list = new ArrayList<>();
        }
        for (T pet : pets) {
            list.add(pet);
        }
        return list;
    }

    private List<Pet> createMutablePetList(Pet ... pets) {
        List<Pet> petList = new ArrayList<>();
        petList.addAll(Arrays.asList(pets));
        return petList;
    }

    private void processCollection(Collection<Pet> pets, String text) {
        System.out.println("\nProcessing Collection: " + text);
        System.out.println("pets.size = " + pets.size());
        pets.add(rover);
        pets.add(rover);
        pets.add(felix);
        pets.add(polly);
        pets.add(rover);
        pets.add(rover);
        pets.add(lizzy);
        pets.add(lizzy);
        pets.add(null);
        if (pets instanceof List) {
            List<Pet> petsList = (List<Pet>) pets;
            petsList.add(1, rango);
            boolean isRoverRemoved = petsList.remove(0) == rover;
            System.out.printf(" Rover removed: %1$b%n", isRoverRemoved);
        }
        boolean isLizzyRemoved = pets.remove(lizzy);
        System.out.printf(" Lizzy removed: %1$b%n", isLizzyRemoved);
        System.out.println("pets.size = " + pets.size());
        for (Pet pet : pets) {
            System.out.println(pet == null ? "<null pet>" : "pet name = " + pet.getName());
        }

        if (pets.contains(rover)) {
            System.out.println("Rover is in pets");
        }
        System.out.printf("Lizzy is %1$s pets%n", pets.contains(lizzy) ? "in" : "not in");
    }

    public void arrays() {
        System.out.println("\nArrays");
        Pet[] pets0 = new Pet[]{polly, rango, lizzy, felix};

        Pet[] pets1 = new Pet[3];
        pets1[0] = rover;
        pets1[1] = fido;
        pets1[2] = new Cat("Tom", 70, 'L', true);

        System.out.println("about to exercise pets1 pets");
        for (Pet pet : pets1) {
            pet.getExercise();
        }

        pets1[2] = null;

        System.out.println("about to exercise pets1 & pets2 pets");
        exercisePets(pets1, pets0);
    }

    public void exercisePets(Pet[] pets0, Pet[] pets1) {
        int minLength = Math.min(pets0.length, pets1.length);
        for (int i = 0; i < minLength; i++) {
            Pet p0 = pets0[i];
            if (p0 != null) p0.getExercise();
            pets1[i].getExercise();
        }
    }
}
