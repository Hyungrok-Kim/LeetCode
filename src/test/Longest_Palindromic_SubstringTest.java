import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.DynamicProgramming.Longest_Palindromic_Substring;

import static org.assertj.core.api.Assertions.assertThat;

public class Longest_Palindromic_SubstringTest extends TestCase {

    @Test
    public void testLongestPalindrome() {
        Longest_Palindromic_Substring lps = new Longest_Palindromic_Substring();

        assertThat(lps.longestPalindrome("babad")).isEqualTo("bab");
        assertThat(lps.longestPalindrome("cbbd")).isEqualTo("bb");
    }
}