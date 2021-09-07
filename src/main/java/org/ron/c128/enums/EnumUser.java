package org.ron.c128.enums;

public class EnumUser {

    public static void main(String[] args) {
        EnumUser enumUser = new EnumUser();

        System.out.println("\ngo1()");
        enumUser.go1("fido", true);
        enumUser.go1("tiddles", false);
        enumUser.go1("francis", null);

        System.out.println("\ngo2()");
        enumUser.go2("fido", Gender.MALE);
        enumUser.go2("tiddles", Gender.FEMALE);
        enumUser.go2("francis", Gender.OTHER);
        enumUser.go2("chris", Gender.DONT_KNOW);

        enumUser.seasonality();
    }

    public void go1(String petName, Boolean isMale) {
//        System.out.println("your pet " + petName + " is " +  (isMale ? "Male" : "Female"));
        String s = "petName: " + petName + "; gender: ";
        if (isMale == null) {
            s += "Unknown";
        } else {
            s += isMale ? "Male" : "Female";
        }
        System.out.println(s);
    }

    public void go2(String petName, Gender gender) {
        String s = "petName: " + petName + "; gender: " + gender + "; ";
        switch (gender) {
            case MALE: s += "it's a boy!"; break;
            case FEMALE: s += "it's a girl!"; break;
            default: s += "it's yours!"; break;
        }
        System.out.println(s);
    }

    public void seasonality() {
        System.out.println("\nseasonality()");
//        new Season(); // cannot invoke constructor

        for (Season season : Season.values()) {
            System.out.println("season=" + season + " = " + season.name().toLowerCase() + " = " + season.getNameMC() +
                    ", altName=" + season.getAltName() +
                    ", desc=" + season.getDescription() +
                    ", start=" + season.getStart(2021));
        }

        System.out.println("\ndata read in from DB");
        String[] strings = new String[] {"SUMMER", "WINTER", "spring", "wInTeR", "fall", "monsoon", null};
        for (String str : strings) {
//            Season season = Season.valueOf(str);
            Season season = Season.getSeason(str);
            if (season == null) {
                System.out.println("season not found: " + str);
            } else {
                System.out.println("str=" + str + ", season=" + season.getNameMC() + ", " + season.getDescription());
            }
        }
    }
}