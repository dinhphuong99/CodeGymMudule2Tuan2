import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTranslateTest {

    @Test
    void traslate() {
        String exepected = "FizzBuzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(15,"");
        fizzBuzzTranslate.traslate();

        assertEquals(exepected,fizzBuzzTranslate.getResult());
    }

    @Test
    void traslate1() {
        String exepected = "Fizz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(9,"");
        fizzBuzzTranslate.traslate();

        assertEquals(exepected,fizzBuzzTranslate.getResult());
    }

    @Test
    void traslate2() {
        String exepected = "Buzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(10,"");
        fizzBuzzTranslate.traslate();

        assertEquals(exepected,fizzBuzzTranslate.getResult());
    }

    @Test
    void traslate3() {
        String exepected = "một sáu";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(16,"");
        fizzBuzzTranslate.traslate();

        assertEquals(exepected,fizzBuzzTranslate.getResult());
    }

//    @Test
//    void traslate3() {
//        String exepected = "16";
//        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(16,"");
//        fizzBuzzTranslate.traslate();
//
//        assertEquals(exepected,fizzBuzzTranslate.getResult());
//    }
}