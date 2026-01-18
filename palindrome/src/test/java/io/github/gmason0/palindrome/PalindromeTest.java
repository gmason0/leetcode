package io.github.gmason0.palindrome;

import org.junit.jupiter.api.Test;

public class PalindromeTest
{

	@Test
	void testExampleOne()
	{
		int input = 121;

		assert(Palindrome.isPalindrome(input));
	}

	@Test
	void testExampleTwo()
	{
		int input = -121;

		assert(!Palindrome.isPalindrome(input));
	}

	@Test
	void testExampleThree()
	{
		int input = 10;

		assert(!Palindrome.isPalindrome(input));
	}
}