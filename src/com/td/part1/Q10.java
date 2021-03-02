package com.td.part1;

import java.util.HashSet;
import java.util.Set;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> perm =permuteAndStore("TEST");
		System.out.println(perm);
	}
	
	public static Set<String> permuteAndStore(String str) {

		  return permuteAndStore("", str);
		}

	private static Set<String> 
		    permuteAndStore(String prefix, String str) {
		
		  Set<String> permutations = new HashSet<>();
		  int n = str.length();

		  if (n == 0) {
		    permutations.add(prefix);
		  } else {
		    for (int i = 0; i < n; i++) {
			    permutations.addAll(
			    		permuteAndStore(prefix + str.charAt(i),
		        str.substring(i + 1, n) + str.substring(0, i)));
		     
		    }
		  }

		  return permutations;
		}
		
}
