package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void shouldRemain() {
        CashbackService cashbackService = new CashbackService();

        int amount = 2000;
        int expected = 50;

        int actual = cashbackService.remain(amount);

        assertEquals(expected, actual);


    }
}