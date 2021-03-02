package com.td.part1;

import java.util.HashMap;
import java.util.Map;

public class Q01 {
	public static void main(String[] args) {
		//1. Counting duplicate characters
		
		String str = "This is my first problem";
		Map<String,Integer> results = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			String ch  =Character.toString( str.charAt(i) );  
			results.compute(ch, (k,v) -> (v==null?1 : ++v) );
		}
		
		for(Map.Entry<String,Integer> result : results.entrySet() ) {
			
			System.out.println(result.getKey() + " " + result.getValue() );
		}  
	}
}
