package ru.netology.pandc.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void CalcSqrNormal() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcSqrZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcSqrMinus() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(-300, -100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcSqrAll() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqrt(100, 9_801);

        Assertions.assertEquals(expected, actual);
    }
}