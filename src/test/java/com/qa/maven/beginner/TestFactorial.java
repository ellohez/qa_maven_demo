package com.qa.maven.beginner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestFactorial {

	Factorials facts = new Factorials();

	@Test
	void testFactorial() {

		assertEquals(120, this.facts.sumFactorial(5));
		assertEquals(720, this.facts.sumFactorial(6));
		assertEquals(1, this.facts.sumFactorial(1));
	}

	@Test
	void testReverseFactorial() {
		assertEquals(5, this.facts.reverseFactorial(120));
//		Returns 0 if not a factorial
		assertEquals(0, this.facts.reverseFactorial(121));
	}
}
