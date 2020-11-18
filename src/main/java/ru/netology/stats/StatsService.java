package ru.netology.stats;


public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int calculateMaxSumMonth(int[] sales) {
        int maxSum = sales[0];
        for (int sale : sales) {
            if (sale > maxSum) {
                maxSum = sale;
            }
        }
        int numberMonthMax = 0;
        int numberMonth = 0;
        for (int sale : sales) {
            numberMonth++;
            if (sale == maxSum) {
                numberMonthMax = numberMonth;
            }
        }


        return numberMonthMax;
    }

    public int calculateMinSumMonth(int[] sales) {
        int MinSum = sales[0];
        for (int sale : sales) {
            if (sale < MinSum) {
                MinSum = sale;
            }
        }
        int numberMonthMin = 0;
        int numberMonth = 0;
        for (int sale : sales) {
            numberMonth++;
            if (sale == MinSum) {
                numberMonthMin = numberMonth;
            }
        }
        return numberMonthMin;
    }


    public int calculateMonthAboveAverage(int[] sales) {
        int average = calculateAverageSum(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }

    public int calculateMonthBelowAverage(int[] sales) {
        int average = calculateAverageSum(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }
}



