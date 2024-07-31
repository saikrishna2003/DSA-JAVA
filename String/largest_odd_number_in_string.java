//1903. Largest Odd Number in String
//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
//
//A substring is a contiguous sequence of characters within a string.
//
// 
//
//Example 1:
//
//Input: num = "52"
//Output: "5"
//Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//Example 2:
//
//Input: num = "4206"
//Output: ""
//Explanation: There are no odd numbers in "4206".
//Example 3:
//
//Input: num = "35427"
//Output: "35427"
//Explanation: "35427" is already an odd number.
// 
//
//Constraints:
//
//1 <= num.length <= 105
//num only consists of digits and does not contain any leading zeros.



package striverjava;

public class largest_odd_number_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "35427";
		System.out.print(largest(a));

	}
	public static String largest(String a)
	{
		int n = a.length();
		for(int i=n-1;i>=0;i--)
		{
			if((a.charAt(i)-'0')%2==1)
			{
				return a.substring(0,i+1);
			}
		}
		return "";
		}

}
