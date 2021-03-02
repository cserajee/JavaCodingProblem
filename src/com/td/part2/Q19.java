package com.td.part2;

public class Q19 {

	public static void main(String[] args) {
		// 19 Sum of n natural number
		Q19.SumMethod01(7);
		Q19.SumMethod02(7);
	}

	private static void SumMethod01(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) sum += i;
		
		System.out.println("Sum: " + sum);
	}

	private static void SumMethod02(int n) {
		int sum = (n * (n + 1)) / 2 ;
		System.out.println("Sum: " + sum);
	}

}
