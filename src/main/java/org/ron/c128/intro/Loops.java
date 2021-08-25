package org.ron.c128.intro;

import java.util.Random;

public class Loops {

    private static Random random = new Random();

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();
    }

    private static void forLoop() {
        System.out.println("Basic Loop");
        for (int i = 0; i < 10; i++) System.out.println("i=" + i);

        System.out.println("\nLoop over String");
        String s = "C103";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i=" + i + " char=" + s.charAt(i));
        }

        System.out.println("\nEnhanced For Loop");
        for (char c : s.toCharArray()) {
            System.out.println("char=" + c);
        }

        System.out.println("\nLoop over int array");
        int[] ints = new int[]{88, 99, 77, 123};
        for (int i : ints) {
            System.out.println("i=" + i);
        }
    }

    private static void whileLoop() {

        System.out.println("\nBasic While Loop");
        int i = 0;
        while (i < 10) {
            System.out.println("i=" + i);
            i++;
        }

        System.out.println("\nWhile Loop with random condition");
        while (random.nextInt(100) < 66) {
            System.out.println("hello");
            if (random.nextInt(100) < 50) {
                System.out.println("bye");
                break;
            }
        }

        System.out.println("\nWhile true");
        while (true) {
            if (random.nextInt(100) % 2 == 0) {
                System.out.println("howdy");
                continue;
            }
            System.out.println("hello");
            if (random.nextInt(100) % 3 == 0) {
                System.out.println("bye");
                break;
            }
        }
    }

    private static void doWhileLoop() {

        System.out.println("\nBasic Do-While Loop");
        do {
            System.out.println("hi");
        } while (random.nextInt(100) % 3 == 0);

        System.out.println("\nDo-While Loop");
        do {
            System.out.println("hi");
            if (random.nextInt(100) % 2 == 0) {
                System.out.println("hello");
                continue;
            }
            if (random.nextInt(100) % 2 == 0) {
                System.out.println("howdy");
                break;
            }
        } while (random.nextInt(100) % 3 == 0);
    }
}
