package org.ron.c128.my1stOOP.car;

import java.util.Objects;

public class Engine {

    private final int sizeInMils;
    private final String fuelType;
    private int hoursUsed;

    public Engine(int sizeInMils, String fuelType) {
        this.sizeInMils = sizeInMils;
        this.fuelType = fuelType;
    }

    public int getSizeInMils() {
        return sizeInMils;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getHoursUsed() {
        return hoursUsed;
    }

    public void setHoursUsed(int hoursUsed) {
        this.hoursUsed = hoursUsed;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "sizeInMils=" + sizeInMils +
                ", fuelType='" + fuelType + '\'' +
                ", hoursUsed=" + hoursUsed +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Engine e = (Engine) obj;
        return sizeInMils == e.sizeInMils && Objects.equals(fuelType, e.fuelType);
    }
}
