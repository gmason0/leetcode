package io.github.gmason0.atoi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringToIntegerTest
{

	@Test
	void testExampleOne()
	{
		String input = "42";

		assertEquals(42, StringToInteger.myAtoi(input));
	}

	@Test
	void testExampleTwo()
	{
		String input = "   -042";

		assertEquals(-42, StringToInteger.myAtoi(input));
	}

	@Test
	void testExampleThree()
	{
		String input = "1337c0d3";

		assertEquals(1337, StringToInteger.myAtoi(input));
	}

	@Test
	void testExampleFour()
	{
		String input = "0-1";

		assertEquals(0, StringToInteger.myAtoi(input));
	}

	@Test
	void testExampleFive()
	{
		String input = "words and 987";

		assertEquals(0, StringToInteger.myAtoi(input));
	}
}
