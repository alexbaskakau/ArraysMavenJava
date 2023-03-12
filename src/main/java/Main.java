import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long minMonth = service.minSales(sales);//
        System.out.println(minMonth);


        long amount = service.totalAmount(sales);//
        System.out.println(amount);

        long average = service.averageValue(sales);
        System.out.println(average);

        long maxMonth = service.maxSales(sales);
        System.out.println(maxMonth);

        long maxMonthSales = service.monthMaxSales(sales);
        System.out.println(maxMonthSales);

        long minMonthSales = service.monthMinSales(sales);
        System.out.println(minMonthSales);
    }
}