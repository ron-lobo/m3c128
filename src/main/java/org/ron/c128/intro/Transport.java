package org.ron.c128.intro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transport {

    private interface Vehicle {
        void stop();
        void go();
    }

    private class Bicycle implements Vehicle {
        public final String name;
        public Bicycle(String name) {
            this.name = name;
        }
        public void stop() {
            System.out.println("bike " + name + ": brake - Bike stops");
        }
        public void go() {
            System.out.println("bike " + name + ": pedal hard - Bike moves");
        }
    }

    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.doSomething();
    }

    public void doSomething() {
        Bicycle b1 = new Bicycle("bike001");
        Bicycle b2 = new Bicycle("bike002");
        b1.go();
        b2.go();
        b1.stop();

        Vehicle plane = new Vehicle() {
            public void stop() {
                System.out.println("plane takes off");
            }
            public void go() {
                System.out.println("plane lands");
            }
        };

        plane.go();
        plane.stop();
    }

    private void xyz() {
        JButton b = new JButton();
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // do some work
            }
        });
    }
}
