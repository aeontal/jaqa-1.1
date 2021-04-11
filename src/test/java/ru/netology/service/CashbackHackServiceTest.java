package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

//import org.testng.annotations.Test;
//import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService ();



    @Test
    public void shouldCashBackBoundaryMoreThanThousand() {
        int actual = service.remain(1130);
        int expect = 870;
        assertEquals(expect,actual);
    }

    @Test
    public void shouldCashBackEqualLimits() {
        int actual = service.remain(1000);
        int expect = 0;
        assertEquals(expect,actual);
    }
    @Test
    public void shouldCashBackEqualZero() {
        int actual = service.remain(0);
        int expect = 1000;
        assertEquals(expect,actual);
    }
    @Test
    public void shouldCashBackLessThenThousand() {
        int actual = service.remain(550);
        int expect = 450;
        assertEquals(expect,actual);
    }
}