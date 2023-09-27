package ru.netology.stats;

import java.util.Arrays;
import java.util.OptionalLong;

public class StatsService {

    //1. Сумма всех продаж
    public int sumSales(long[] sales) {
        int sumSalesMonth = 0;
        for (int a = 0; a < sales.length; a++) {
            sumSalesMonth += sales[a]; //сумма всех продаж
        }
        return sumSalesMonth;
    }

    //2. Cредняя величина продаж в месяц

    public int averageSales(long[] sales) {
        int sumSalesMonths = sumSales(sales); // вызывает метод суммы всех продаж
        int averageSalesMonths = sumSalesMonths / sales.length; // среднее значение продаж;
        return averageSalesMonths;
    }

    //3. Номер месяца, в котором был пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0; //номер месяца с пиком продаж

        for (int a = 0; a < sales.length; a++) {
            if (sales[a] >= sales[maxMonth]) {//значит в а-месяце продаж больше
                maxMonth = a; //запомним как максимальный
            }
        }
        return maxMonth + 1; //нужно сдвинуть на 1,тк нумерование месяцев идет с 1
    }

    //4. Номер месяца, в котором был минимум продаж

    public int minSales(long[] sales) {
        int minMonth = 0; //номер месяца с минимумом продаж
        for (int a = 0; a < sales.length; a++) {
            if (sales[a] <= sales[minMonth]) {//значит в а-месяце продаж меньше
                minMonth = a; //запомним как минимальный
            }
        }
        return minMonth + 1; //нужно сдвинуть на 1, тк нумерование месяцев идёт с 1
    }

    //4. Количество месяцев, в которых продажи были ниже среднего

    public int salesBelowAverage(long[] sales) {
        int averageSalesMonths = averageSales(sales); // вызывает метод расчета среднего значения
        int countMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesMonths) {
                countMonths += 1; // увеличения счетчика месяцев
            }
        }
        return countMonths;
    }
    //5. Количество месяцев, в которых продажи были выше среднего

    public int salesAboveAverage(long[] sales) {
        int averageSalesMonths = averageSales(sales); // вызывает метод расчета среднего значения
        int countMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesMonths) {
                countMonths += 1; // увеличения счетчика месяцев
            }
        }
        return countMonths;
    }
}

