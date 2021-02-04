package ru.netology.CsvTraining;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    // параметризованный тест, ссылающийся на источник данных в виде цсв
    @ParameterizedTest
@CsvFileSource(resources = "/datafortest.csv")

    // метод
    void weCalculate(String text, long amount, boolean registered, long expected){ // описываем вводные
    BonusService variable = new BonusService(); // инициализируем
    long actual = variable.calculate(amount, registered); // инициализированное идет к методу в BonusService
    assertEquals(expected, actual);
    }
}