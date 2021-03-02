package com.td.part2;

public class Q16 {

	public static void main(String[] args) {
		// 16. Checking that a string contains a substring
		Q16.stringHasMethod01("This is my 16th program", "s m");
		Q16.stringHasMethod02("This is my 16th program", "th");

	}

	private static void stringHasMethod01(String text, String subtext) {
		if(text.contains(subtext))
			System.out.println("Subtext present in text");
		else
			System.out.println("Subtext not present in text");
	}
	
	private static void stringHasMethod02(String text, String subtext) {

		if(text.indexOf(subtext)>=0)
			System.out.println("Subtext present in text");
		else
			System.out.println("Subtext not present in text");
	}

}
