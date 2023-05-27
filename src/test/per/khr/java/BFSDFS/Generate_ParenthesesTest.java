package per.khr.java.BFSDFS;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Generate_ParenthesesTest {

    @Test
    void generateParenthesis() {
        Generate_Parentheses generate_parentheses = new Generate_Parentheses();
        assertThat(generate_parentheses.generateParenthesis(1)).isEqualTo(Arrays.asList("()"));
        assertThat(generate_parentheses.generateParenthesis(3)).isEqualTo(Arrays.asList(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()")
        );
    }
}