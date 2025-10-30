package com.csen160.C_lambda;

import java.util.Arrays;

public class Lambda_Trim4 {
	public static void main(String[] args) {
		String[] words = { "M", "\n\tSkyfall", " Q\t", "\t\tAdele\t" };

		Arrays.sort(words, (String s1, String s2) -> {
			return s1.trim().compareTo(s2.trim());
		});

		System.out.println(Arrays.toString(words));
	}
}
