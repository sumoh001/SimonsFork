package ch.zhaw.iwi.devops.primenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class primeNumberCheckerTest {

    @Test
    public void testPrimeNumberChecker1() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Assertions.assertFalse(checker.isPrime(1));  // 1 is not a prime number
    }


}