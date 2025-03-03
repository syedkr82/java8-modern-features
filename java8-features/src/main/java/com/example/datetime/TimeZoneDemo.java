package com.example.datetime;

import java.time.*;

public class TimeZoneDemo {
    public static void main(String[] args) {
        // Get current date-time in a specific time zone
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India Time: " + indiaTime);

        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time: " + nyTime);

        // Convert LocalDateTime to another time zone
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedNY = localDateTime.atZone(ZoneId.of("America/New_York"));
        ZonedDateTime zonedLondon = zonedNY.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Converted London Time: " + zonedLondon);
    }
}
