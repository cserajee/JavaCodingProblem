package com.td.part1;

 

public class Q03 {
	public static void main(String[] args) {
		//3. Reversing letters and words
		String str = "This is my first problem Test";
		String input[] = str.split(" "); 
		StringBuilder sb = new StringBuilder();
		for(int i=input.length-1;i>=0;i--) {
			for(int j = (input[i].length() - 1); j>=0; j-- ) {
				sb.append(input[i].charAt(j));
			}
			sb.append(" ");
		}
		System.out.println(sb.toString().trim()); 
	}
}
