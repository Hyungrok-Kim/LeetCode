package per.khr.java.hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class Valid_ParenthesesTest {

    @Test
    public void isValid() {
        Valid_Parentheses vp = new Valid_Parentheses();

        assertTrue(vp.isValid("()"));
        assertTrue(vp.isValid("()[]{}"));
        assertFalse(vp.isValid("(]"));
    }
}