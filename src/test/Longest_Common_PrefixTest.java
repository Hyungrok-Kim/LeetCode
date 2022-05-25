import org.junit.Test;
import per.khr.java.hash.Longest_Common_Prefix;

//import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Longest_Common_PrefixTest {
    @Test
    public void test() {
        Longest_Common_Prefix lcp = new Longest_Common_Prefix();
        assertThat(lcp.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(lcp.longestCommonPrefix(new String[]{"dog","racecar","car"})).isEqualTo("");
    }

}