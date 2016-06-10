package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyStringHelperParameterisedTester {
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;

	public MyStringHelperParameterisedTester(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		// AACD => CD, ACD => CD, CDEF = >CDEF, CDAA => CDAA
		String expectedOutputs[][] = { {"AACD", "CD"},	{"ACD", "CD"} };
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
//		expected, actual
	}
}
 