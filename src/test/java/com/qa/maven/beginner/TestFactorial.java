package com.qa.maven.beginner;

import org.junit.jupiter.api.Test;

class TestFactorial {

	@Test
	public void test_FACTORIAL() {
		Factorials facts = new Factorials();
		AssertEquals(120, facts.sumFactorial(5));
	}
}
