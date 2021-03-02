package com.td.part2;

public class Q20 {

	public static void main(String[] args) {
		// 20. Concatenating the same string n times
		Q20.stringConcat("Pgm",5);
	}

	private static void stringConcat(String text, int n) {
		 StringBuilder sb = new StringBuilder();
		 for(int i=0;i<n;i++) sb.append(text);
		 System.out.println(sb);
	}

}
