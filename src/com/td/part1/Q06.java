package com.td.part1;

public class Q06 {

	public static void main(String[] args) {
		//06. Counting the occurrences of a certain character
		 Q06.getCharCountMethod01("This is my 6th program find char h", 'h');
		 Q06.getCharCountMethod02("This is my 6th program find char m", 'm');
		 Q06.getCharCountMethod03("This is my 6th program find char i", 'i');
	}

	private static void getCharCountMethod01(String str, char ch) {
		int count = str.length() - str.replace(String.valueOf(ch), "").length();
		
		System.out.println(ch + " has " + count + "  occurances");
		
	}

	private static void getCharCountMethod02(String str, char ch) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i)) count++;
		}
		System.out.println(ch + " has " + count + "  occurances");
	}
	
	private static void getCharCountMethod03(String str, char ch) {
 
		long count = str.chars()
						.filter(c -> ch == (char) c )
						.count();
		
		System.out.println(ch + " has " + count + "  occurances");
		
	}

}
