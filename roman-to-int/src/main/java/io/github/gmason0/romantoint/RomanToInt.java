package io.github.gmason0.romantoint;

import java.util.Map;

public class RomanToInt
{

	static Map<Character, Integer> romanMap = Map.of(
		'I', 1,
		'V', 5,
		'X', 10,
		'L', 50,
		'C', 100,
		'D', 500,
		'M', 1000
	);

	static int romanToInt(String s)
	{
		int result = 0;

		for (int i = 0; i < s.length(); i++)
		{
			int currentValue = romanMap.get(s.charAt(i));

			if (i + 1 < s.length() && currentValue < romanMap.get(s.charAt(i + 1)))
			{
				result -= currentValue;
			}
			else
			{
				result += currentValue;
			}
		}

		return result;
	}
}
