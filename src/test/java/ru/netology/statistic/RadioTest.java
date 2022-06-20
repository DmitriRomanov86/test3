package ru.netology.statistic;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void currentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(3);
        cond.setCurrentStation(-1);
        int actual = cond.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void currentStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(-3);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

}