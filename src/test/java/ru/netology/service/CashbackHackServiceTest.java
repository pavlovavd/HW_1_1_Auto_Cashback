package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void ReturnOfTheAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ReturnOfTheAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ReturnOfTheAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ReturnOfTheAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}