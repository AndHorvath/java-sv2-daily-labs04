package day04;

import java.util.List;

public class Stock {

    private List<Double> dailyRates;

    public Stock(List<Double> dailyRates) {
        this.dailyRates = dailyRates;
    }

    public double maxProfit() {
        double maxProfit = Double.MIN_VALUE;

        for (int i = 0; i < dailyRates.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (dailyRates.get(i) - dailyRates.get(j) > maxProfit) {
                    maxProfit = dailyRates.get(i) - dailyRates.get(j);
                }
            }
        }
        return maxProfit;
    }
}