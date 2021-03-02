package com.td.part1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q05 {
	public static final Set<Character> vowelList = new  HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u')) ;
	public static void main(String[] args) {
		// 5. Counting vowels and consonants
		Q05.getVowelConsonant("This is my 5th program");
		Q05.getVowelConsonantStreamFilter("This is my 5th program");
	}
	public static void getVowelConsonant(String str) {
		int vowel  = 0;
		int consonant = 0 ;
		char strChar;
		str= str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			strChar =  str.charAt(i);
			if(vowelList.contains(strChar) == true) {
				vowel++;
			}
			else if(strChar>= 'a' && strChar <='z') {
				consonant++;
			}
		} 
		System.out.println("Vowel : " + vowel);
		System.out.println("Consonant : " + consonant);
	}

	private static void getVowelConsonantStreamFilter(String str) {
		long vowel  = 0;
		long consonant = 0 ; 
		str= str.toLowerCase();
		vowel = str.chars()
				.filter(c -> vowelList.contains((char)c) )
				.count();
		consonant = str.chars()
				.filter(c -> !vowelList.contains((char)c))
				.filter(c -> (c>='a' && c<='z'))
				.count();
		System.out.println("Vowel : " + vowel);
		System.out.println("Consonant : " + consonant);
	}
}
