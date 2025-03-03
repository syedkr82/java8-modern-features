package com.example.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class BasicDateTimeDemo {
    public static void main(String[] args) {
        // 1️⃣ LocalDate - Get current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // 2️⃣ LocalTime - Get current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // 3️⃣ LocalDateTime - Get current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date-Time: " + dateTime);

        // 4️⃣ ZonedDateTime - Get current time with time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current Zoned Date-Time: " + zonedDateTime);

        // 5️⃣ Instant - Get current timestamp
        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp (UTC): " + timestamp);

        // 6️⃣ Formatting Date-Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted Date-Time: " + dateTime.format(formatter));

        // 7️⃣ Parsing Date-Time
        String dateStr = "2025-03-05 14:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed Date-Time: " + parsedDate);
    }
}
