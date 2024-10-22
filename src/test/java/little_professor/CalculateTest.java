package little_professor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculateTest {
	@Test
	void add() {
		int num = Calculate.add(2, 5);
		assertTrue(num == 7);
	}

	@Test
	void sub() {
		int num = Calculate.sub(7, 5);
		assertTrue(num == 2);
	}

	@Test
	void multiply() {
		int num = Calculate.multiply(2, 4);
		assertTrue(num == 8);
	}

	@Test
	void power() {
		int num = Calculate.power(3, 3);
		assertTrue(num == 27);
	}

	@Test
	void div() {
		int num = Calculate.div(19, 3);
		assertTrue(num == 6);
	}

	@Test
	void divide() {
		double num = Calculate.divide(9, 3);
		assertTrue(num == 3.0);
	}

	@Test
	void mod() {
		int num = Calculate.mod(10, 3);
		assertTrue(num == 1);
	}
}
