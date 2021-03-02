package com.td.part1;

public class Q08 {

	public static void main(String[] args) {
		// 8. Removing white spaces from a string
		Q08.removeWhiteSpaceMethod01("This is my 8th program");
		Q08.removeWhiteSpaceMethod02("This is my 8th program");
	}

	private static void removeWhiteSpaceMethod01(String string) { 
		System.out.println(string.replace(" ", ""));
	}

	private static void removeWhiteSpaceMethod02(String string) {
		System.out.println(string.replaceAll("\\s", ""));
	}

}
