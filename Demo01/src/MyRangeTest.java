import org.junit.jupiter.api.Test;
import org.w3c.dom.ranges.Range;

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
    public void getSecondNumberEndWithInclude() {
        MyRange range = new MyRange("[1,5]");
        int secondNumber = range.getSecondNumber();
        assertEquals(5,secondNumber);
    }

    @Test
    public void getSecondNumberEndWithExclude() {
        MyRange range = new MyRange("[1,5)");
        int secondNumber = range.getSecondNumber();
        assertEquals(4,secondNumber);
    }

    @Test
    public void StartWithWrongParenthesis() {
        MyRange range = new MyRange("{3,5]");
        boolean isCorrect = range.checkStart();
        assertFalse(isCorrect);
    }

    @Test
    public void EndWithWrongParenthesis() {
        MyRange range = new MyRange("[3,5}");
        boolean isCorrect = range.checkEnd();
        assertFalse(isCorrect);
    }

    @Test
    public void FirstNumberIsGreater() {
        MyRange range = new MyRange("[5,4]");
        boolean isCorrect = range.checkNumber();
        assertFalse(isCorrect);
    }

    @Test
    public void WrongFormat() {
        MyRange range = new MyRange("[35}");
        boolean isCorrect = range.checkFormat();
        assertFalse(isCorrect);
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

    @Test
    public void result03() {
        MyRange range = new MyRange("[1,5)");
        String result = range.getResult();
        assertEquals("1,2,3,4", result);
    }

    @Test
    public void result04() {
        MyRange range = new MyRange("(1,5)");
        String result = range.getResult();
        assertEquals("2,3,4", result);
    }
}
