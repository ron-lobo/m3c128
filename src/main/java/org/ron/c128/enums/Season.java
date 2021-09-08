package org.ron.c128.enums;

import java.time.LocalDate;
import java.time.Month;

public enum Season {

    SPRING(Month.MARCH, "flower season"),
    SUMMER(Month.JUNE, "sunnytime"),
    AUTUMN(Month.SEPTEMBER, "falling leaves", "Fall"),
    WINTER(Month.DECEMBER, "chill zone");

    private final Month startMonth;
    private final String description;
    private final String altName;

    Season(Month startMonth, String description) {
        this(startMonth, description, null);
    }

    Season(Month startMonth, String description, String altName) {
        this.startMonth = startMonth;
        this.description = description;
        this.altName = altName;
    }

    public String getDescription() {
        return description;
    }

    public String getAltName() {
//        return altName;
        return altName == null ? getNameMC() : altName;
    }

    public String getNameMC() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

    public LocalDate getStart(int year) {
        return LocalDate.of(year, startMonth, 23);
    }

    public LocalDate getNextStartDate() {
        // processing to compute next start date
        LocalDate now = LocalDate.now();
        LocalDate startDate = getStart(now.getYear());
        return now.isBefore(startDate) ? startDate : startDate.withYear(now.getYear()+1);
    }

    public static Season getSeason(String str) {
        for (Season season : values()) {
            if (season.name().equalsIgnoreCase(str) ||
                    season.getAltName().equalsIgnoreCase(str)) {
                return season;
            }
        }
        return null;
    }
}
