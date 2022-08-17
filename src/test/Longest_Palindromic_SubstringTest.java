import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.DynamicProgramming.Longest_Palindromic_Substring;

import static org.assertj.core.api.Assertions.assertThat;

public class Longest_Palindromic_SubstringTest extends TestCase {

    @Test
    public void testLongestPalindrome() {
        assertThat(new Longest_Palindromic_Substring().longestPalindrome("babad")).isEqualTo("bab");
        assertThat(new Longest_Palindromic_Substring().longestPalindrome("cbbd")).isEqualTo("bb");
    }
}