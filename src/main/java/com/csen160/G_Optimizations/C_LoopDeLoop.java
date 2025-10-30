package com.csen160.G_Optimizations;

public class C_LoopDeLoop {
	public static int NUM_COLS = 16000;
	public static int NUM_ROWS = 16000;
	public static int[][] myArr=new int[NUM_ROWS][NUM_COLS];
	
	public static void forLoopSlow() {
		long start=System.currentTimeMillis();
		for (int col = 0; col < NUM_COLS; col++) {
		    for (int row = 0; row < NUM_ROWS; row++) {
		    	C_LoopDeLoop.myArr[row][col] = (int)(Math.random() * 6);
		    }
		}
		long end=System.currentTimeMillis();
		System.out.println("Time forLoopSlow() in ms="+(end-start));
	}
	
	public static void forLoopFast() {
		long start=System.currentTimeMillis();
		for (int row = 0; row < NUM_ROWS; row++) {
		    for (int col = 0; col < NUM_COLS; col++) {
		    	C_LoopDeLoop.myArr[row][col] = (int)(Math.random() * 6);
		    }
		}
		long end=System.currentTimeMillis();
		System.out.println("Time forLoopFast() in ms="+(end-start));
	}	
	
	public static void main(String[] args) {
		C_LoopDeLoop.forLoopSlow();
		C_LoopDeLoop.forLoopFast();
	}
}