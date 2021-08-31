package org.ron.c128.my1stOOP.car;

import java.util.Objects;

public class Car {

    private final String licencePlate;
    private final String model;

    private Engine engine;
    private int speed;
    private char direction;

    public Car(String licencePlate, String model) {
        this(licencePlate, model, null);
    }

    public Car(String licencePlate, String model, Engine engine) {
        if (licencePlate == null || model == null) {
            throw new RuntimeException("Cannot create car without licencePlate and/or model");
        }
        this.licencePlate = licencePlate;
        this.model = model;
        this.engine = engine;
        this.direction = '?';
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Car c = (Car) obj;
        return model.equals(c.model) &&
                licencePlate.equals(c.licencePlate) &&
                (engine == null ? c.engine == null : engine.equals(c.engine));
    }

    @Override
    public int hashCode() {
        return Objects.hash(licencePlate, model, engine, speed, direction);
    }

    @Override
    public String toString() {
        return "Car {" +
                "licencePlate = " + licencePlate +
                ", model = " + model +
                ", engine = " + engine +
                ", speed = " + speed +
                ", direction = " + direction +
                "}";
    }

    public static void main(String[] args) {
        Car c = new Car("xyz", "GM1");
        System.out.println("c = " + c);
    }
}
