package com.td.part2;

import java.util.HashMap;
import java.util.Map;

public class Q18 {

	public static void main(String[] args) {
		// 18. Checking whether two strings are anagrams
		Q18.findAnagrams("This is my 18th program", "is this my 18th program");
	}

	private static void findAnagrams(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		Map<Character, Integer> o = new HashMap<>();
		boolean result = false;
		if (str1.length() == str2.length()) {
			result = true;
			for (int i = 0; i < str1.length(); i++) {
				char c1 = str1.charAt(i);
				o.compute(c1, (k, v) -> v == null ? 1 : ++v);
				char c2 = str2.charAt(i);
				o.compute(c2, (k, v) -> v == null ? -1 : --v);
			}
			for(Map.Entry<Character, Integer> e:o.entrySet()) {
				if(e.getValue()!=0) {
					result=false;
					break;
				}
			}
			
		}
		if(result) {
			System.out.println("Given is an anagrams");
		}
		else {
			System.out.println("Given is not an anagrams");
		}

	}

}
