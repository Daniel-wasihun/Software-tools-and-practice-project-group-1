package tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class FibonacciTest {
	Fibonacci fibonacci = new Fibonacci();
//	@DisplayName("This is anagram checker test")
	@Test
	public void fibonacciSeriesTestZero() {
	int expected = 0;
		 Assertions.assertSame(expected, fibonacci.fibonacciRecursion(0));
	}
	@Test
	public void fibonacciSeriesTestOne() {
	int expected = 1;
		 Assertions.assertSame(expected, fibonacci.fibonacciRecursion(1));
	}
	@Test
	public void fibonacciSeriesTest() {
	int expected = 21;
		 Assertions.assertSame(expected, fibonacci.fibonacciRecursion(8));
	}
}
