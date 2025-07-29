package ru.productstar.basejunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void isPrime() {
        Assertions.assertTrue(Main.isPrime(5));
        Assertions.assertFalse(Main.isPrime(6));
        Assertions.assertFalse(Main.isPrime(0));
        Assertions.assertFalse(Main.isPrime(-1));
        Assertions.assertTrue(Main.isPrime(2147483647)); // Максимальное значение Int
        Assertions.assertEquals(Main.isPrime(5),true); // Сравнение по значению просто попробовать
    }
}