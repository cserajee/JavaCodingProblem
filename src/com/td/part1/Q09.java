package com.td.part1;

public class Q09 {

	public static void main(String[] args) {
		// 9.Joining multiple strings with a delimiter
		Q09.joingWithDelimiter(':', "a", "b", "c");
		Q09.joingWithDelimiter('@', "a", "b", "c", "d", "e");
	}

	private static void joingWithDelimiter(char c, String...strings) {
		 System.out.println(String.join(Character.toString(c), strings));
		 
		
		
	}

}
