package pl.wiktor.githubaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void sumOf2And2ShouldReturn4() {
        //given
        int a = 2;
        int b = 2;
        int expectedSum = 4;
        //when
        int actualSum = new Calculator(a, b).sum();

        //then
        assertEquals(expectedSum, actualSum);
    }
}