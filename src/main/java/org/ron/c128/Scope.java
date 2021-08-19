package org.ron.c128;

public class Scope {

    private int i = 123;
    protected char c = 'x';
    public static final String s = "hi";        // constant
    double d = 1.234;

    private final StringBuilder sb = new StringBuilder();
    private StringBuilder sb1 = new StringBuilder();


    public static void m0(int x) {
        // i++;
        // d += 99;
    }

    public void m1(int i) {}

    public void m1() {
        // s = "bye";
        // sb = null;
        sb1 = null;

        i++;
        d += 99;

        System.out.println("sb = " + sb);
        sb.append(123);
        sb.append(" xyz ");
        sb.append(3.14);
        System.err.println("sb = " + sb);
    }

    public static void main(String[] args) {
        System.out.println("s = " + s);
        // System.out.println("sb = " + sb);

        Scope s0 = new Scope();
        Scope s1 = new Scope();
        s0.m1();
        //m1();
        m0(0);
    }


    private class C128 {
    }

    private static class C130 {
    }
}
