package ru.netology.stats;


public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long totalAmount(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            // if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
            // minMonth = i; // запомним его как минимальный
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageValue(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long average = sum / sales.length;
        return average;

    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthMaxSales(long[] sales) {
        int month = 0;
        long average = averageValue(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                month = month + 1;


            }

        }
        return month;
    }

    public int monthMinSales(long[] sales) {
        int month = 0;
        long average = averageValue(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                month = month + 1;


            }

        }
        return month;
    }
}








