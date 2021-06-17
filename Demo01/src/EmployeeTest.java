import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    @DisplayName("เมื่อทำการสร้าง Employee ด้วย default constructor" + "จะต้องได้ fullname = : ")
    public void case01() {
        String expected = " : ";
        Employee demo = new Employee();
        String actual = demo.getFullName();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("เมื่อทำการสร้าง Employee ด้วย F L" + "จะต้องได้ fullname = F : L")
    public void case02() {
        String expected = "F : L";
        Employee demo = new Employee("F", "L");
        String actual = demo.getFullName();

        assertEquals(expected, actual);
    }
}