package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService ();



    @Test
    public void shouldCashBackBoundaryMoreThanThousand() {
        int actual = service.remain(1130);
        int expect = 870;
        assertEquals(actual, expect);
    }

    @Test
    public void shouldCashBackEqualLimits() {
        int actual = service.remain(1000);
        int expect = 0;
        assertEquals(actual, expect);
    }
    @Test
    public void shouldCashBackEqualZero() {
        int actual = service.remain(0);
        int expect = 1000;
        assertEquals(actual, expect);
    }
    @Test
    public void shouldCashBackLessThenThousand() {
        int actual = service.remain(550);
        int expect = 450;
        assertEquals(actual, expect);
    }
}