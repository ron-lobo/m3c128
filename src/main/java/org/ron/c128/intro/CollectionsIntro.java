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
        ci.maps1();
        ci.maps2();
        ci.maps3();
    }

    private void maps1() {
        System.out.println("\nMaps1");

        Map<Integer, String> numMap = new HashMap<>();
        numMap.put(1, "one");
        numMap.put(2, "two");
        numMap.put(3, "three");
        numMap.put(null, null);

        System.out.println("key=2, value = " + numMap.get(2));
        numMap.put(2, "TWO");
        System.out.println("key=2, value = " + numMap.get(2));
        numMap.remove(2, "2");
        System.out.println("key=2, value = " + numMap.get(2));
        numMap.remove(2);
        System.out.println("key=2, value = " + numMap.get(2));

        Map<Integer, Integer> squaresMap1 = Map.of(1, 1, 2, 4, 3, 9, 4, 16, 5, 25, 6, 36);
        Map<Integer, Integer> squaresMap2 = Map.ofEntries(Map.entry(1, 1), Map.entry(2, 4), Map.entry(3, 9));
        numMap = Map.of(1, "one", 2, "Two", 3, "three", 4, "four", 5, "five");

        System.out.println("\n contents of map:");
        for (Integer key : numMap.keySet()) {
            System.out.printf("key=%1$d, value=%2$s%n", key, numMap.get(key));
        }

        System.out.println("\n contents of map (using entrySet()):");
        for (Map.Entry<Integer, String> entry : numMap.entrySet()) {
            System.out.printf("key=%1$d, value=%2$s%n", entry.getKey(), entry.getValue());
        }

        System.out.println("\n values in map:" + numMap.values());

        if (numMap.containsKey(2))
            System.out.println("2 is in map");
        System.out.println("value 222 in map: " + numMap.containsValue(222));
    }

    private void maps2() {
        System.out.println("\nMaps2");

        Map<String, Pet> petMap = new HashMap<>();
        petMap.put(rover.getName(), rover);
        petMap.put(fido.getName(), fido);
        petMap.put(felix.getName(), felix);
        petMap.put("Polly", polly);

        System.out.println("my favourite pet is: " + petMap.get("Felix"));
        System.out.println("my favourite pet is: " + petMap.get("Felix").getName());


        Map<String, List<Pet>> owner2PetSet = new HashMap<>();
        owner2PetSet.put("Ironman", addToMutableList(null, rover, felix));
        owner2PetSet.put("Batman", addToMutableList(null, polly, fido));
        owner2PetSet.put("Cap America", addToMutableList(null, rango));

        System.out.println("\nsuperhero pets:");
        for (String hero : owner2PetSet.keySet()) {
            List<Pet> pets = owner2PetSet.get(hero);
            System.out.printf("%1$s owns %2$d pets: %3$s%n", hero, pets.size(), pets);
        }

        // add lizzy to Ironman
        owner2PetSet.get("Ironman").add(lizzy);

        // add lizzy to Batman
        List<Pet> batmansPets = owner2PetSet.get("Batman");
        batmansPets.add(lizzy);

        System.out.println("\nupdated superhero pets:");
        for (String hero : owner2PetSet.keySet()) {
            List<Pet> pets = owner2PetSet.get(hero);
            System.out.printf("%1$s owns %2$d pets: %3$s%n", hero, pets.size(), pets);
        }
    }

    private void maps3() {
        System.out.println("\nMaps3");

        Map<Pet, String> pet2OwnerMap = new HashMap<>();
        pet2OwnerMap.put(rover, "Ironman");
        pet2OwnerMap.put(fido, "Batman");
        pet2OwnerMap.put(rango, "Ironman");
        pet2OwnerMap.put(felix, "Batman");
        pet2OwnerMap.put(lizzy, "Ironman");
        pet2OwnerMap.put(polly, "Batman");

        System.out.println("pets & owners:");
        for (Pet pet : pet2OwnerMap.keySet()) {
            System.out.printf("%1$s owned by %2$s%n", pet.getName(), pet2OwnerMap.get(pet));
        }
    }

    private void sets() {
        System.out.println("\nSets");
        Set<Pet> petSet1 = new HashSet<>();
        processCollection(petSet1, "HashSet");

//        Set<Pet> petSet2 = new TreeSet<>();
//        processCollection(petSet2, "TreeSet");
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

    private <T> List<T> addToMutableList(List<T> list, T... pets) {
        if (list == null) {
            list = new ArrayList<>();
        }
        for (T pet : pets) {
            list.add(pet);
        }
        return list;
    }

    private List<Pet> createMutablePetList(Pet... pets) {
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

        Dog myDog = new Dog("Rover", 4, 'S', true);
        System.out.println("myDog equals Rover : " + myDog.equals(rover));
        System.out.printf("myDog (%1$s) is %2$s pets%n",
                myDog.getName(), pets.contains(myDog) ? "in" : "not in");
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
