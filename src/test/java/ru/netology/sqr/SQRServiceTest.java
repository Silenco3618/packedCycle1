package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/score.csv")
    public void testScore(int expected, int i_min, int i_max) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(i_min, i_max);
        assertEquals(expected, actual);
    }
}
