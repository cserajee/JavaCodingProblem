package com.td.part1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q02 {
	public static void main(String[] args) {
		//2. Finding the first non-repeated character 
		String str = "This is my first problem Test";
		Map<String,Integer> results = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			String ch  =Character.toString( str.charAt(i) );  
			results.compute(ch, (k,v) -> (v==null?1 : ++v) );
		}
		
		
		for(Map.Entry<String,Integer> result : results.entrySet() ) {
			
			if(result.getValue() == 1) {
				System.out.println(result.getKey() + " " + result.getValue() );
				break;
			}
		}  
	}
}
