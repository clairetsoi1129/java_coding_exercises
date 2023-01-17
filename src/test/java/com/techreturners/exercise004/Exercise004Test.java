package com.techreturners.exercise004;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenDateIsSpecifiedWithVeryBigDate() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(999999968, Month.APRIL, 23));
        LocalDateTime expected = LocalDateTime.of(999999999, Month.DECEMBER, 31, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithVeryBigDate() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(999999968, Month.APRIL, 23, 22, 13, 19, 999999999));
        LocalDateTime expected = LocalDateTime.of(999999999, Month.DECEMBER, 31, 23, 59, 59, 999999999);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenDateIsSpecifiedWithVerySmallDate() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(-999999999, Month.JANUARY, 1));
        LocalDateTime expected = LocalDateTime.of(-999999968, Month.SEPTEMBER, 9, 1, 46, 40, 0);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedVerySmallDate() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(-999999999, Month.JANUARY, 1, 0, 0, 0, 0));
        LocalDateTime expected = LocalDateTime.of(-999999968, Month.SEPTEMBER, 9, 1, 46, 40, 0);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedAndMaxThrowException() {
        Exception exception = assertThrows(DateTimeException.class, () -> {
            Exercise004 ex004 = new Exercise004(LocalDateTime.of(999999999, Month.DECEMBER, 31,
                    23, 59, 59, 999999999));
            ex004.getDateTime();
        });

        String expectedMessage = "Invalid value for EpochDay (valid values -365243219162 - 365241780471):";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkGetDateTimeWhenDateIsSpecifiedAndMaxThrowException() {
        Exception exception = assertThrows(DateTimeException.class, () -> {
            Exercise004 ex004 = new Exercise004(LocalDate.of(999999999, Month.DECEMBER, 31));
            ex004.getDateTime();
        });

        String expectedMessage = "Invalid value for EpochDay (valid values -365243219162 - 365241780471):";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
