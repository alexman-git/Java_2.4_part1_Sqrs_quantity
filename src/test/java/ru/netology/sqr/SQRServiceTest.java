package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"positiveOnLimits,200,300,3",
            "positiveEquivalencePartition,202,298,3",
            "positiveBoundariesIn,201,299,3",
            "positiveBoundariesOut,199,301,3",
            "negative,110,120,0"})
    void shouldCount(String testCase, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.count(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}
