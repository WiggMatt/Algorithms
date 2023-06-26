package LeetCode;

/*
Вам дан массив prices где prices[i]это цена данной акции на i день.
Вы хотите максимизировать свою прибыль,
выбрав один день для покупки одной акции и выбрав другой день в будущем для продажи этой акции.

Верните максимальную прибыль,
которую вы можете получить от этой сделки . Если вы не можете получить какую-либо прибыль, вернитесь 0.

Пример 1:
Вход:  цены = [7,1,5,3,6,4]
Выход:  5
Объяснение:  покупка во 2-й день (цена = 1) и продажа в 5-й день (цена = 6), прибыль = 6-1 = 5.
Обратите внимание, что покупка во 2-й день и продажа в 1-й день не разрешены, потому что вы должны купить перед продажей.
*/


public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
