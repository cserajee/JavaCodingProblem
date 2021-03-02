package com.td.part2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q14 {

	public static void main(String[] args) {
		// 14. Finding the character with the most appearances
		Q14.findMostAppearChar("This is my 14th java coding problem ");

	}

	private static void findMostAppearChar(String string) {

		Map<Character, Integer> output = new HashMap<>();
		for(int i=0;i<string.length();i++) {
			char ch = string.charAt(i);
			if(Character.isWhitespace(ch) == false)
			output.compute(ch, (k, v ) -> ( v == null ? 1 : ++v ) ); 
		}
		Integer noOfOccur = Collections.max(output.values());
		Character charName = Character.MIN_VALUE;
		for(Map.Entry<Character, Integer> e : output.entrySet()) {
			
			if(e.getValue() == noOfOccur) { charName = e.getKey(); break; }
		}
		System.out.println(charName + " : " + noOfOccur);
	}

}
