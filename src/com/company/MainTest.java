package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void is_even() {
        String y = Main.Is_even(8);
        assertEquals("YES",y);
    }
    @Test
    void is_even2() {
        String y = Main.Is_even(2);
        assertEquals("NO",y);
    }
    @Test
    void is_even3() {
        String y = Main.Is_even(2);
        assertEquals("NO",y);
    }
    @Test
    void is_even4() {
        String y = Main.Is_even(9);
        assertEquals("NO",y);
    }
}