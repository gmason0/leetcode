package io.github.gmason0.reverseint;

public class ReverseInteger
{

	static int reverse(int x)
	{
		long reversed = 0;
		int isNegative = x < 0 ? -1 : 1;
		x = Math.abs(x);

		while (x > 0)
		{
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}

		reversed *= isNegative;
		if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
		{
			return 0;
		}
		return (int) reversed;
	}
}
