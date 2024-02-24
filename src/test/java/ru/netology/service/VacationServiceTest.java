package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ru.netology.service.VacationService;

public class VacationServiceTest {

    @Test
    public void testCalculateVacationService1() {
        VacationService service = new VacationService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calculateVacations(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
