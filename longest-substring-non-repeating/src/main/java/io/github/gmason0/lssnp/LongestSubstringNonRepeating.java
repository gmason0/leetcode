package io.github.gmason0.lssnp;

public class LongestSubstringNonRepeating
{
	static int lengthOfLongestSubstring(String s)
	{
		int n = s.length();
		int result = 0;
		int[] index = new int[128];

		for (int j = 0, i = 0; j < n; j++)
		{
			i = Math.max(index[s.charAt(j)], i);
			result = Math.max(result, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return result;
	}
}
