import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(1, 1, 2018);
        NextDayCalculator theNextDay = nextDayCalculator.nextDay();

        assertEquals(2, theNextDay.getDay());
        assertEquals(1, theNextDay.getMonth());
        assertEquals(2018, theNextDay.getYear());
    }

    @Test
    void nextDayAndNextMonth() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(31, 1, 2018);
        NextDayCalculator theNextDay = nextDayCalculator.nextDay();

        assertEquals(1, theNextDay.getDay());
        assertEquals(2, theNextDay.getMonth());
        assertEquals(2018, theNextDay.getYear());
    }

    @Test
    void nextDayAndNextMonth1() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(30, 4, 2018);
        NextDayCalculator theNextDay = nextDayCalculator.nextDay();

        assertEquals(1, theNextDay.getDay());
        assertEquals(5, theNextDay.getMonth());
        assertEquals(2018, theNextDay.getYear());
    }

    @Test
    void nextDayAndNextMonth2() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(28, 2, 2018);
        NextDayCalculator theNextDay = nextDayCalculator.nextDay();

        assertEquals(1, theNextDay.getDay());
        assertEquals(3, theNextDay.getMonth());
        assertEquals(2018, theNextDay.getYear());
    }

    @Test
    void nextDayAndNextMonth3() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(29, 2, 2020);
        NextDayCalculator theNextDay = nextDayCalculator.nextDay();

        assertEquals(1, theNextDay.getDay());
        assertEquals(3, theNextDay.getMonth());
        assertEquals(2020, theNextDay.getYear());
    }

    @Test
    void nextDayAndNextYear() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(31, 12, 2018);
        NextDayCalculator theNextDay = nextDayCalculator.nextDay();

        assertEquals(1, theNextDay.getDay());
        assertEquals(1, theNextDay.getMonth());
        assertEquals(2019, theNextDay.getYear());
    }
}