package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath math=new MyMath();

	@Test
	void calculateSumThreeMemberArray() {
		int expectedResult = 6;
		assertEquals(expectedResult,math.calculateSum(new int[] {1, 2, 3}));
	}
	
	@Test
	void calculateSumZeroLengthArray() {
		int expectedResult = 0;
		assertEquals(expectedResult,math.calculateSum(new int[] {}));
	}

}
