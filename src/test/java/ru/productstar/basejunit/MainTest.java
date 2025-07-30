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

        Assertions.assertTrue(Main.isPrime(7)); // Для разнообразия
        Assertions.assertTrue(Main.isPrime(681787)); // Большое простое число
        Assertions.assertFalse(Main.isPrime(34908059)); // Большое составное число
        Assertions.assertTrue(Main.isPrime(2)); // Наименьшее простое число
        Assertions.assertFalse(Main.isPrime(1)); // Спорное составное число

    }
}