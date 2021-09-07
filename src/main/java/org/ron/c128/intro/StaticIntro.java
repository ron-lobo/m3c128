package org.ron.c128.intro;

// import static java.lang.System.out;
// import org.junit.jupiter.api.Assertions;
//import static org.junit.jupiter.api.Assertions.*;

public class StaticIntro {

    public static final int NUM_EMPLOYEES = 99;

    private static String location1 = "London";
    private static String location2 = getLocation(2);
    private static String location3;
    private static String location4;

    private String location888;
    private String location999 = getLocation(999);

    static {
        System.out.println("start of static initialiser");
        location3 = "Paris";

//        StaticIntro si = new StaticIntro(0);
//        int x = si.method1();
//        String y = si.method2(x);
//        location4 = si.method3(x, y);

        System.out.println("end of static initialiser");
    }

    public static String getLocation(int i) {
        System.out.println("getLocation i=" + i);
        return "Glasgow " + i;
    }

    public StaticIntro(int i) {
        System.out.println("creating new object: i=" + i);
        location888 = getLocation(888);
    }

    public static void main(String[] args) {
        System.out.println("start of program");
        StaticIntro si = new StaticIntro(1);
        System.out.println("location=" + si.getLocation(55));
        System.out.println("end of program");
    }

    private int method1() {
//        Assertions.assertTrue(true); // static import
//        assertTrue(true); // static import
        return -1;
    }
}
