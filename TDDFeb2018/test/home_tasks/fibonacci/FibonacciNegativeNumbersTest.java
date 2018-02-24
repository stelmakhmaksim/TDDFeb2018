package home_tasks.fibonacci;

import org.junit.Test;

public class FibonacciNegativeNumbersTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNegativeNumber() {
        Fibonacci fb = new Fibonacci();
        fb.fibRecursive(-5);
    }

}
