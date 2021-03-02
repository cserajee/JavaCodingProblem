package com.td.part2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q12 {

	public static void main(String[] args) {
		// 12 Removing duplicate characters
		Q12.removeDuplicateMethod01("This is my 12th program");
		Q12.removeDuplicateMethod02("This is my 12th program");

	}

	private static void removeDuplicateMethod01(String string) {

		char chList[] = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<chList.length;i++) {
			if(sb.indexOf(Character.toString(chList[i])) == -1) {
				sb.append(chList[i]);
			}
		}
		
		System.out.println(sb);
		
	}

	private static void removeDuplicateMethod02(String string) {

		String str =  Arrays.asList(string.split("")).stream()
					.distinct()
					.collect(Collectors.joining());

		System.out.println(str);		
	}

}
