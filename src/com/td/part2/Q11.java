package com.td.part2;

public class Q11 {

	public static void main(String[] args) {
		// 11. Checking whether a string is a palindrome
		Q11.checkPalindrome("MAM");
		Q11.checkPalindrome("MAMA");
		Q11.checkPalindrome("AMMA");
	}

	private static void checkPalindrome(String string) {
		 int n = string.length();
		 boolean isPloy = true;
		 for(int i=0;i< n/2; i++) {
			 if(string.charAt(i) != string.charAt(n - i - 1)) { isPloy = false; break; }
		 }
		 System.out.println(string + (isPloy?" ":" not ") + "Palindrome");
	}

}
