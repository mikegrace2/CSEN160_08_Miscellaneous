package com.csen160.G_Optimizations;


public class B_Fibonacci {
    // Recursive Fibonacci
    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    // For-Loop Fibonacci
    public static int fib2(int n){
      int f[] = new int[n+1];

      f[0] = 0;
      f[1] = 1;

      for (int i = 2; i <= n; i++)
          f[i] = f[i-1] + f[i-2];

       return f[n];
     }
    
    public static void main(String[] args) {
        // Change this value to compute more or fewer Fibonacci numbers
        int howManyTimes = 46; // 46 is very slow for recursive

    	long start1=System.currentTimeMillis();
        for (int i = 1; i <= howManyTimes; i++) {
            System.out.println(i+". "+fib(i));
        }
        long end1=System.currentTimeMillis();
        
    	long start2=System.currentTimeMillis();
        for (int i = 1; i <= howManyTimes; i++) {
            System.out.println(i+". "+fib2(i));
        }
        long end2=System.currentTimeMillis();

        System.out.println();
        System.out.println("howManyTimes = "+howManyTimes);
        System.out.println("Fibonacci Recursive Time in ms: "+(end1-start1));
        System.out.println("Fibonacci For-Loop  Time in ms: "+(end2-start2));
    }
}