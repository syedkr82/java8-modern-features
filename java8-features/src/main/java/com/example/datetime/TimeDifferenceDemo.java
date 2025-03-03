package com.example.datetime;

import java.time.*;

public class TimeDifferenceDemo {
    public static void main(String[] args) {
        // 1️⃣ Calculate difference between two dates (Period)
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 3, 5);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period Difference: " + period.getYears() + " Years, "
                + period.getMonths() + " Months, " + period.getDays() + " Days");

        // 2️⃣ Calculate difference between two timestamps (Duration)
        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(15, 45);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration Difference: " + duration.toHours() + " Hours, "
                + duration.toMinutes() + " Minutes");
    }
}
