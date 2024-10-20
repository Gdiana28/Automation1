package com.endava.day12;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Exercises {
	@Test
	void testMultiply() {
		assertEquals(20, multiply(4, 5));
	}

	@Test
	void testPow() {
		assertEquals(16, Math.pow(4, 2));
	}

	@Test
	void testFactorial() {
		assertEquals(120, factorial(5));
	}

	// Implementarile metodelor testate
	int multiply(int a, int b) {
		return a * b;
	}

	int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}

}
