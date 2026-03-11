import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
    @ParameterizedTest
    @CsvSource({"2,true", "3,true", "4,false"})
    void isPrime(int input, boolean expected) {
        boolean result = Practice.isPrime(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1", "0"})
    void numLessThanTwo(int input){
        boolean result = Practice.isPrime(input);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "5,5",
            "7,13"
    })
    void fibonacci(int input, int expected){
        int result = Practice.fibonacci(input);
        assertEquals(expected, result);
    }

    @Test
    void fibonacciNegative(){
        assertThrows(IllegalArgumentException.class, () -> {
            Practice.fibonacci(-1);
        });
    }
}