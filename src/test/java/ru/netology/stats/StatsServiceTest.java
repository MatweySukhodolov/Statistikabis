package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {

    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 180;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.calculateSumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 15;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //вызываем целевой метод:
        int actual = service.findAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMinSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 9;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //вызываем целевой метод:
        int actual = service.findMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 8;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //вызываем целевой метод:
        int actual = service.findMaxSales(sales);
        assertEquals(expected, actual);
    }


    @Test
    void lessThanAvergSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 7;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.lessThanAvergSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void aboveAvergSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 7;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.aboveAvergSales(sales);
        assertEquals(expected, actual);

    }


}
