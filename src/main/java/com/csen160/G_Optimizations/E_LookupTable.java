package com.csen160.G_Optimizations;

public class E_LookupTable {
	public static int[] DAYS_PER_MONTH = {-1, 
			31, // January
			28, // February
			31, // March
			30, // April
			31, // Mai
			30, // June
			31, // July
			31, // August
			30, // September
			31, // October
			30, // November
			31};// December

	public static int daysOfAMonthIfs(int month) {
		if (month == 9 || month == 4 || month == 6 || month == 11) {
		    return 30;
		} else if (month == 2) {
		    return 28;
		} else {
		    return 31;
		}
	}
	
	public static int daysOfAMonthLookup(int month) {
		return E_LookupTable.DAYS_PER_MONTH[month];
	}
	
	public static void main(String[] args) {
		int SIZE=2_00_000_000;
		int[] numberArr=new int[SIZE];
		for (int i=0;i<SIZE;i++) {
			numberArr[i]=(int)(Math.random() * 12);
		}
		
		long start1=System.currentTimeMillis();
		for (int i=0;i<SIZE;i++) {
			E_LookupTable.daysOfAMonthIfs(numberArr[i]);
		}
		long end1=System.currentTimeMillis();
		System.out.println("Executed="+SIZE+" daysOfAMonthIfs    ms="+(end1-start1));
		
		long start2=System.currentTimeMillis();
		for (int i=0;i<SIZE;i++) {
			E_LookupTable.daysOfAMonthLookup(numberArr[i]);
		}
		long end2=System.currentTimeMillis();
		System.out.println("Executed="+SIZE+" daysOfAMonthLookup ms="+(end2-start2));
	}
}
