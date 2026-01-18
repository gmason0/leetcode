package io.github.gmason0.palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PalindromeTest
{

	@Test
	void testExampleOne()
	{
		int input = 121;

		assertTrue(Palindrome.isPalindrome(input));
	}

	@Test
	void testExampleTwo()
	{
		int input = -121;

		assertFalse(Palindrome.isPalindrome(input));
	}

	@Test
	void testExampleThree()
	{
		int input = 10;

		assertFalse(Palindrome.isPalindrome(input));
	}
}