package io.github.gmason0.vp;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest
{
	@Test
	void testExampleOne()
	{
		String input = "()";

		assert(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleTwo()
	{
		String input = "()[]{}";

		assert(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleThree()
	{
		String input = "(]";

		assert(!ValidParentheses.isValid(input));
	}

	@Test
	void testExampleFour()
	{
		String input = "([])";

		assert(ValidParentheses.isValid(input));
	}

	@Test
	void testExampleFive()
	{
		String input = "([)]";

		assert(!ValidParentheses.isValid(input));
	}
}
