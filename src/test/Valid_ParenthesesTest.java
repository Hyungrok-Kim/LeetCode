import org.junit.Test;
import per.khr.java.Stack.Valid_Parentheses;

import static org.junit.Assert.*;

public class Valid_ParenthesesTest {

    @Test
    public void isValid() {
        Valid_Parentheses vp = new Valid_Parentheses();

        assertTrue(vp.isValid("()"));
        assertTrue(vp.isValid("()[]{}"));
        assertFalse(vp.isValid("(]"));
    }

    @Test
    public void isValid2() {
        Valid_Parentheses vp = new Valid_Parentheses();

        assertTrue(vp.isValid2("()"));
        assertTrue(vp.isValid2("()[]{}"));
        assertFalse(vp.isValid2("(]"));
    }
}