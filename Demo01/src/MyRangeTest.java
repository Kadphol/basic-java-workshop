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

    @Test
    public void EndWithInclude() {
        MyRange range = new MyRange("[1,5]");
        boolean isInclude = range.checkEndWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void EndWithExclude() {
        MyRange range = new MyRange("[1,5)");
        boolean isInclude = range.checkEndWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void result01() {
        MyRange range = new MyRange("[1,5]");
        String result = range.getResult();
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    public void result02() {
        MyRange range = new MyRange("(1,5]");
        String result = range.getResult();
        assertEquals("2,3,4,5", result);
    }
}
