package per.khr.java.Else;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class Letter_Combinations_of_a_Phone_NumberTest {

    @Test
    public void letterCombinations() {
        Letter_Combinations_of_a_Phone_Number letter_combinations_of_a_phone_number = new Letter_Combinations_of_a_Phone_Number();
//        assertThat(letter_combinations_of_a_phone_number.letterCombinations("2")).isEqualTo(
//            Arrays.asList("a", "b", "c"));
        assertThat(letter_combinations_of_a_phone_number.letterCombinations("23")).isEqualTo(
            Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
}