package com.td.part2;

public class Q17 {

	public static void main(String[] args) {
		// 17. Counting substring occurrences in a string 
		Q17.stringOccurCount("This is my 17th Java coding program. It is used to find substring occurance", "is");

	}

	private static void stringOccurCount(String string, String string2) {
		 String[] count=string.split(string2);
		 System.out.println(count.length - 1);
	}

}
