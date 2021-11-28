package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackServiceTest {

    @Test
    public void shouldRemain1000Amount0() {
        CashbackService service = new CashbackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldRemain0Amount1000() {
        CashbackService service = new CashbackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemain300Amount1700() {
        CashbackService service = new CashbackService();

        int amount = 1700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemain999Amount1() {
        CashbackService service = new CashbackService();

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldRemain999Amount1001() {
        CashbackService service = new CashbackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemain1Amount999() {
        CashbackService service = new CashbackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }
}