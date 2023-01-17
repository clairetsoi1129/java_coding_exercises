package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    @SuppressWarnings("FieldMayBeFinal")
    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime =  date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        final long GIGA_SEC = 1000000000;
        return this.dateTime.plusSeconds(GIGA_SEC);
    }
}
