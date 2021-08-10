import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {
        Prime number = new Prime(1);
        boolean exep = false;
        boolean actual = number.isPrime();
        assertEquals(exep,actual);
    }

    @Test
    void isPrime1() {
        Prime number = new Prime(3);
        boolean exep = true;
        boolean actual = number.isPrime();
        assertEquals(exep,actual);
    }

    @Test
    void isPrime2() {
        Prime number = new Prime(4);
        boolean exep = false;
        boolean actual = number.isPrime();
        assertEquals(exep,actual);
    }

    @Test
    void isPrime3() {
        Prime number = new Prime(5);
        boolean exep = true;
        boolean actual = number.isPrime();
        assertEquals(exep,actual);
    }

    @Test
    void isPrime4() {
        Prime number = new Prime(5001);
        boolean exep = false;
        boolean actual = number.isPrime();
        assertEquals(exep,actual);
    }
}