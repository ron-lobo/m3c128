package org.ron.c128.my1stOOP;

public class Car {

    private final String licencePlate;
    private final String model;

    private int speed;
    private char direction;

    public Car(String licencePlate, String model) {
        this.licencePlate = licencePlate;
        this.model = model;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char newDirection) {
        direction = newDirection;
    }

    public boolean equals(Object obj) {
        Car c = (Car) obj;
        return this.model == c.model && this.licencePlate == c.licencePlate;
    }
}
