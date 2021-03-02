package com.td.part2;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
		// 15 Sorting an array of strings by length
		String[] str = { "Ravi", "Vijay", "Ajay", "Anuj", "Gaurav", "Hanumat", "Mango", "Banana" };

		System.out.println("-------------ASC--------------");
		Q15.sortingArray(str, "ASC");
		System.out.println("-------------DESC--------------");
		Q15.sortingArray(str, "DESC");
		
	}

	private static void sortingArray(String[] str, String sort) {
		if(sort == "ASC") {
			Arrays.sort(str, (a,b) ->    (a.length() > b.length()? 1 : -1) );
		}
		else {
			Arrays.sort(str, (a,b) ->    (a.length() < b.length()? 1 : -1) );
		}
		 for(String s : str) {
			 System.out.println(s);
		 }
	}

}
