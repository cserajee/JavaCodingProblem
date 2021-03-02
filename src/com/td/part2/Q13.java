package com.td.part2;

public class Q13 {

	public static void main(String[] args) {
		// 13 Removing a given character
		Q13.removeGivenCharacter("This is my @#$%^&<> 13th program", '<');
	}

	private static void removeGivenCharacter(String string, char c) {
		 string = string.replace(Character.toString(c), "");
		 System.out.println(string);
	}

}
