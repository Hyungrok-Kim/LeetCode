import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.DynamicProgramming.Best_Time_to_Buy_and_Sell_Stock;

import static org.assertj.core.api.Assertions.assertThat;

public class Best_Time_to_Buy_and_Sell_StockTest extends TestCase {

    @Test
    public void testMaxProfit() {
        Best_Time_to_Buy_and_Sell_Stock bttbast = new Best_Time_to_Buy_and_Sell_Stock();

        assertThat(bttbast.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(bttbast.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }
}