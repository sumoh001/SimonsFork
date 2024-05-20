package ch.zhaw.iwi.devops.primenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class primeNumberCheckerTest {

    @Test
    public void testPrimeNumberChecker1() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertFalse(checker.isPrime(1));  // 1 is not a prime number
    }

    @Test
    public void testPrimeNumberChecker2() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertTrue(checker.isPrime(2));  // 2 is a prime number
    }

    @Test
    public void testPrimeNumberChecker3() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertTrue(checker.isPrime(3));  // 3 is a prime number
    }

    @Test
    public void testPrimeNumberChecker4() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertFalse(checker.isPrime(4));  // 4 is not a prime number
    }

    @Test
    public void testPrimeNumberChecker5() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertTrue(checker.isPrime(5));  // 5 is a prime number
    }

    @Test
    public void testPrimeNumberChecker6() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertFalse(checker.isPrime(6));  // 6 is not a prime number
    }

    @Test
    public void testPrimeNumberChecker7() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertTrue(checker.isPrime(7));  // 7 is a prime number
    }

    @Test
    public void testPrimeNumberChecker8() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertFalse(checker.isPrime(8));  // 8 is not a prime number
    }

    @Test
    public void testPrimeNumberChecker9() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertFalse(checker.isPrime(9));  // 9 is not a prime number
    }

    @Test
    public void testPrimeNumberChecker10() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertTrue(checker.isPrime(11));  // 11 is a prime number
    }
}