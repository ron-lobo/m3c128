package org.ron.c128;

public class Primitives {

    public static void main(String[] args) {

        byte by = 0;            // -128 .. 127          8 bits = 1 byte
        short s = 32767;        // -32768 .. 32767      16 bits = 2 bytes
        int i = 1;              // -2.1B .. 2.1B        32 bits = 4 bytes
        long l = 1234567890;    //                      64 bits = 8 bytes

        float f = 1.23f;        // 32 bits
        double d = 1.234;       // 64 bits

        char c = 'a';           // 16 bits unicode
        boolean b = true;       // 1 bit

        Byte by1;
        Integer i1 = 3;
        Double d1 = 1.234;
        Character c1 = 'z';

        // Integer i2 = new Integer(123); // prior to Java 5

        long l0 = m1(1, 2);
        int i2 = m1(i, i1);
        Integer i3 = m1(i1, i);

        i += 5;
        i1 += 5;

        String str = "hi";
        str += " world";

        int[] ints0 = new int[]{1, 2, 3};
        Integer[] ints1 = new Integer[]{1, 2, 3};
    }

    private static Integer m1(int i, Integer j) {
        System.out.println("i = " + i + ", j = " + j);
        return i + j;
    }
}
