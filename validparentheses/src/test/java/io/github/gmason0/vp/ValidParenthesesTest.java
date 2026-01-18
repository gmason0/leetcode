package io.github.gmason0.vp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest
{
	@Test
	void testExampleOne()
	{
		String input = "()";

		assertTrue(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleTwo()
	{
		String input = "()[]{}";

		assertTrue(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleThree()
	{
		String input = "(]";

		assertFalse(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleFour()
	{
		String input = "([])";

		assertTrue(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleFive()
	{
		String input = "([)]";

		assertFalse(ValidParentheses.isValid(input));
	}
}
