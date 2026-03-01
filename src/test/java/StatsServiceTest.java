import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void AmountOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.amountOfSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180 / 12;
        long actual = service.averageAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void salesBelowAverage() {
        StatsService service = new StatsService();//количество месяцев, в которых продажи были ниже среднего
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void salesAboveverage() {
        StatsService service = new StatsService();//количество месяцев, в которых продажи были ниже среднего
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesAboveverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}

