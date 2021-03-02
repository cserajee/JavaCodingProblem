package com.td.part1;

public class Q07 {

	public static void main(String[] args) {
		// 07. Converting a string into an int, long, float, or double
		Q07.stringConversion("4567");
		Q07.stringConversion("45d67");
	}

	private static void stringConversion(String str) {

		Integer  i ;
		Long l;
		Float f;
		Double d;
		
		try {
			i = Integer.valueOf(str);
			System.out.println("Integer value " + i);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot Convert to Integer");
		}

		try {
			l = Long.valueOf(str);
			System.out.println("Long value " + l);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot Convert to Long");
		}

		try {
			f = Float.valueOf(str);
			System.out.println("Float value " + f);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot Convert to Float");
		}

		try {
			d = Double.valueOf(str);
			System.out.println("Double value " + d);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot Convert to Double");
		}
	}

}
