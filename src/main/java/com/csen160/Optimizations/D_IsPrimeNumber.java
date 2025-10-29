package com.csen160.Optimizations;

import java.util.HashMap;
import java.util.Map;

public class D_IsPrimeNumber {
	private static Map<Integer, Boolean> PRIME = new HashMap<>();
	
	public static boolean isPrime(int n) {
	    double sqrt = Math.sqrt(n);
	    
	    for (int i = 2; i <= sqrt; i++) {
	        if (n % i == 0) { 
	        	return false; 
	        }
	    }
	    return true;
	}

	public static boolean isPrime2(int n) {
	    if (!PRIME.containsKey(n))
	        PRIME.put(n, isPrime(n));
	    return PRIME.get(n);
	}

	public static void main(String[] args) {
		int SIZE=100_000_000;
		int[] numberArr=new int[SIZE];
		for (int i=0;i<SIZE;i++) {
			numberArr[i]=(int)(Math.random() * 100);
		}
		
		long start1=System.currentTimeMillis();
		for (int i=0;i<SIZE;i++) {
			D_IsPrimeNumber.isPrime(numberArr[i]);
		}
		long end1=System.currentTimeMillis();
		System.out.println("isPrime standard="+(end1-start1));
		
		long start2=System.currentTimeMillis();
		for (int i=0;i<SIZE;i++) {
			D_IsPrimeNumber.isPrime2(numberArr[i]);
		}
		long end2=System.currentTimeMillis();
		System.out.println("isPrime dynamic="+(end2-start2));
	}
}