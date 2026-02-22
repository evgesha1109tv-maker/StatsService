public class StatsService {
    public int amountOfSales(long[] sales) {
        //Сумма продаж за все месяцы
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return amount;
    }

    public int averageAmount(long[] sales) {
        //Среднее значение за все месяцы
        int average = 0;
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += (int) sales[i];
            average = amount / (sales.length);
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesBelowAverage(long[] sales) {
        int average = 0;
        int amount = 0;
        int belowAverageMoth = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += (int) sales[i];
            average = amount / (sales.length);// находим среднее значение
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // если значение в ячейке меньше среднего то добавлем в счетчике +1
                belowAverageMoth++;
            }
        }
        return belowAverageMoth;
    }

    public int salesAboveverage(long[] sales) {
        int average = 0;
        int amount = 0;
        int aboveAverageMoth = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += (int) sales[i];
            average = amount / (sales.length); // находим среднее значение
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) { //если значение в ячейке больше среднего то добавлем в счетчике +1
                aboveAverageMoth++;
            }
        }
        return aboveAverageMoth;
    }
}
