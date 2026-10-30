package Arrays;

import java.util.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int [] price = {7, 1, 5, 3, 6, 4};

        System.out.println((maxProfit(price)));
    }
    public static int maxProfit (int [] price) {
        int mp = 0, bb = price[0];

        for (int i = 1; i < price.length; i++) {
            if (price[i] > bb) {
                mp = Integer.max(mp, price[i] - bb);
            } else {
                bb = Integer.min(bb, price[i]);
            }
        }
        return mp;
    }
}
