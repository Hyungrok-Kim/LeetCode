package per.khr.java.DynamicProgramming;

/**
 * 카데인 알고리즘
 * - 이전요소의 부분합을 알면 현재요소의 최대값을 알 수 있는 알고리즘
 *
 * minPrice를 가장 낮은 값으로 유지시켜주고
 * 새로 들어오는 값과 minPrice를 계산하여 maxProfit을 가장 높은 값으로 유지시켜준다.
 */
public class Best_Time_to_Buy_and_Sell_Stock {
    /**
     * 3ms
     * faster than 69.44%
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
