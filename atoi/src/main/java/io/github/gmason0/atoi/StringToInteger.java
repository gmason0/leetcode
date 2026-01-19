package io.github.gmason0.atoi;

public class StringToInteger
{
	static int myAtoi(String s)
	{
		s = s.trim();
		int sign = 1;
		int index = 0;
		long res = 0L;

		if (s.isEmpty()) return 0;

		if (s.charAt(0) == '+' || s.charAt(0) == '-')
		{
			sign = s.charAt(0) == '-' ? -1 : 1;
			index++;
		}

		while (index < s.length())
		{
			char ch = s.charAt(index);
			if (ch < '0' || ch > '9') break;

			res = res * 10 + (ch - '0');

			if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if (sign == -1 && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
			index++;
		}
		return (int) (sign * res);
	}
}
