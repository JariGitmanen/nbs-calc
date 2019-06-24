package com.qa.calc;

import org.junit.Assert;
import org.junit.Test;

public class calctest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	@Test
	public void MultiplyTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(2,2);
		Assert.assertEquals(4, result);
	}

}
