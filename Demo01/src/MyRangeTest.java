import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {
    @Test
    public void startWithInclude() {
        MyRange range = new MyRange("[1,5]");
        boolean isInclude = range.checkStartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void startWithExclude() {
        MyRange range = new MyRange("(1,5]");
        boolean isInclude = range.checkStartWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getFirstNumberStartWithInclude() {
        MyRange range = new MyRange("[1,5]");
        int firstNumber = range.getFirstNumber();
        assertEquals(1,firstNumber);
    }

    @Test
    public void getFirstNumberStartWithExclude() {
        MyRange range = new MyRange("(1,5]");
        int firstNumber = range.getFirstNumber();
        assertEquals(2,firstNumber);
    }
}
