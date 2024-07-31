//242. Valid Anagram
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
// 
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false


package striverjava;

import java.util.Arrays;

public class valid_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABDC";
		String b = "BAC";
		System.out.print(find(a,b));

	}
	public static boolean find(String a,String b)
	{
		if(a.length()!=b.length())
		{
			return false;
		}
		
		a= sort(a);
		b = sort(b);
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	public static String sort(String a)
	{
		char b[] = a.toCharArray();
		Arrays.sort(b);
		return new String(b);
	}

}
