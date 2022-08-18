import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.DynamicProgramming.Fibonacci_Number;

import static org.assertj.core.api.Assertions.assertThat;

public class Fibonacci_NumberTest extends TestCase {

    @Test
    public void testFib() {
        assertThat(new Fibonacci_Number().fib(2)).isEqualTo(1);
        assertThat(new Fibonacci_Number().fib(3)).isEqualTo(2);
        assertThat(new Fibonacci_Number().fib(4)).isEqualTo(3);
    }
}