import org.junit.Test;
import per.khr.java.Else.Length_of_Last_Word;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.junit.Assert.*;

public class Length_of_Last_WordTest {

    @Test
    public void lengthOfLastWord() {
        Length_of_Last_Word lol = new Length_of_Last_Word();

        assertThat(lol.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
        assertThat(lol.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
    }
}