package io.github.gmason0.lcp;

public class LongestCommonPrefix
{

	static String longestCommonPrefix(String[] strs)
	{
		StringBuilder prefix = new StringBuilder();
		if (strs == null || strs.length == 0)
		{
			return prefix.toString();
		}

		for (int i = 0; i < strs[0].length(); i++)
		{
			char currentChar = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++)
			{
				if (i >= strs[j].length() || strs[j].charAt(i) != currentChar)
				{
					return prefix.toString();
				}
			}
			prefix.append(currentChar);
		}

		return prefix.toString();
	}
}
