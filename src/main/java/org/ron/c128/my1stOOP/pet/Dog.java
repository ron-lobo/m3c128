package org.ron.c128.my1stOOP.pet;

public class Dog extends Pet {

    private static final double DOG_YEARS_MULTIPLIER = 7.02491;

    private String favouriteDogFood;
    private String favouriteWalk = "any park anywhere";
    private String favouriteToy;

    public Dog(String name, int age, char size, boolean isMale, String fdf) {
        super(name, age, size, isMale);
        favouriteDogFood = fdf;
        favouriteToy = "ball";
    }

    public Dog(String name, int age, char size, boolean isMale) {
        this(name, age, size, isMale, "yoghurt");
    }

    public void expressJoy() {
        System.out.println(getName() + " wags tail");
    }

    public void getExercise() {
        System.out.println(getName() + " walks in park");
    }

    public int getAgeInDogYears() {
        return (int) (getAge() * DOG_YEARS_MULTIPLIER);
    }

    public int getDogYearsMultiplier() {
        return (int) DOG_YEARS_MULTIPLIER;
    }

    public String getFavouriteDogFood() {
        return favouriteDogFood;
    }

    public void setFavouriteDogFood(String favouriteDogFood) {
        this.favouriteDogFood = favouriteDogFood;
    }

    public String getFavouriteWalk() {
        return favouriteWalk;
    }

    public void setFavouriteWalk(String favouriteWalk) {
        this.favouriteWalk = favouriteWalk;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }
}