package com.csen160.Optimizations;


public class A_BuildBigString {
	public final static int REPS = 80000;

	public static String makeString() {
		String str = "";
		for (int n = 0; n < REPS; n++) {
			str += "more";
		}
		return str;
	}
	
	public static String makeStringBuilder() {
		StringBuilder str = new StringBuilder();
		for (int n = 0; n < REPS; n++) {
			str.append("more");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		long start1=System.currentTimeMillis();
		String returnString1=makeString();
		long end1=System.currentTimeMillis();
		System.out.println("Execution time        (String)="+(end1-start1));
		
		long start2=System.currentTimeMillis();
		String returnString2=makeStringBuilder();
		long end2=System.currentTimeMillis();
		System.out.println("Execution time (StringBuilder)="+(end2-start2));
		
		if (returnString1.compareTo(returnString2)==0)
			System.out.println("They are the same!");
		else
			System.out.println("Different!");
	}
}