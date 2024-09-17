package de.java.clip13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId);
        System.out.println(ZoneId.getAvailableZoneIds());
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTimeExample = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTimeExample);
    }
}
