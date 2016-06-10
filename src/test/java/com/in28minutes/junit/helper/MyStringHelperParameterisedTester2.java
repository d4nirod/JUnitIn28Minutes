package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyStringHelperParameterisedTester2 {

	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;

	public MyStringHelperParameterisedTester2(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		// ABCD => false, ABAB => true, AB => true, A => false
		String expectedOutputs[][] = { {"ABCD", "false"},	{"ABAB", "true"}, {"AB", "true"}, {"A", "false"}  };
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertEquals(Boolean.parseBoolean(expectedOutput), helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
////			 assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//		 assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
//		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_TwoCharPositiveScenario() {
//		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
//	}
//
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_OneCharNegativeScenario() {
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
//	}
}
 