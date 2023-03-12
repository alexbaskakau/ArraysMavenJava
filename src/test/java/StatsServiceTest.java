import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageValue() {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageValue(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateTotalAmountSales() {


        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.totalAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMoreThanAverageSales() {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLessThanAverageSales() {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}









