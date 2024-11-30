package DynamicProgramming;

import java.util.Scanner;

public class PalindromicSubstrings {

	public static boolean checkPalin(String s) {
		StringBuilder sb=new StringBuilder(s);
		return sb.reverse().toString().equals(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		boolean [][] dp=new boolean[n][n];
		int count=0;
		 for (int length = 1; length <= n; length++) { // Length of substring
	            for (int i = 0; i <= n - length; i++) { // Start index
	                int j = i + length - 1; // End index
	                
	                if (length == 1) {
	                    dp[i][j] = true; // Single character is always a palindrome
	                } else if (length == 2) {
	                    dp[i][j] = (s.charAt(i) == s.charAt(j)); // Two chars are palindromic if equal
	                } else {
	                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
	                }

	                if (dp[i][j]) {
	                    count++;
	                }
	            }
	        }
		System.out.println(count);
	}

}
