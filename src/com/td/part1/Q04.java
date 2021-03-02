package com.td.part1;

 

public class Q04 {
	public static void main(String[] args) {
		//4. Checking whether a string contains only digits
	    Q04.isDigits("12345");
	    Q04.isDigits("sd342");
	    Q04.isDigitsOpt1("567");
	    Q04.isDigitsOpt1("sdffs");
	}
	
	public static void isDigits(String input) {
		
		boolean isDigit = true;
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))==false) { isDigit = false; break; }
		} 
		if(isDigit==true)
			System.out.println("Given input is a digit");
		else
			System.out.println("Given input is not a digit");
		 
	}
	
	public static void isDigitsOpt1(String input) { 
		
		if(input.matches("[0-9]+"))
			System.out.println("Given input is a digit");
		else
			System.out.println("Given input is not a digit");
		
	}
	
}
