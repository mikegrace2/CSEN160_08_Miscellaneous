package com.csen160.Profiling.Main;

public class MainExecutor implements Runnable {
	public static double calculate_Mult() {
		long start = System.currentTimeMillis();
		double returnVal = 0;
		for (long i = 0; i < 500_000_000; i++) {
			returnVal = returnVal * i * (Math.sqrt(3456) * 3343454.7f);
		}
		long end = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " Multiplications: Time in ms: " + (end - start));

		return returnVal;
	}

	public static double calculate_Div() {
		long start = System.currentTimeMillis();
		double returnVal = 0;
		for (long i = 0; i < 500_000_000; i++) {
			returnVal = returnVal / i / (Math.sqrt(3456) / 3343454.7f);
		}
		long end = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " Divisions: Time in ms: " + (end - start));

		return returnVal;
	}

	public static double calculate_Plus() {
		long start = System.currentTimeMillis();
		double returnVal = 0;
		for (long i = 0; i < 600_000_000; i++) {
			returnVal = returnVal + i + (Math.sqrt(3456) + 3343454.7f);
		}
		long end = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " Additions: Time in ms: " + (end - start));

		return returnVal;
	}

	public static double calculate_Minus() {
		long start = System.currentTimeMillis();
		double returnVal = 0;
		for (long i = 0; i < 400_000_000; i++) {
			returnVal = returnVal - i - (Math.sqrt(3456) - 3343454.7f);
		}
		long end = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " Subtractions: Time in ms: " + (end - start));

		return returnVal;
	}

	public static double randomSelection(int numberOfLoops) {
		double returnVal = 0.0;
		for (int j = 0; j < numberOfLoops; j++) {
			for (int i = 0; i < 10; i++) {
				int rand = (int) (Math.random() * 4);
				if (rand == 0)
					returnVal = +MainExecutor.calculate_Mult();
				else if (rand == 1)
					returnVal = +MainExecutor.calculate_Div();
				else if (rand == 2)
					returnVal = +MainExecutor.calculate_Plus();
				else if (rand == 3)
					returnVal = +MainExecutor.calculate_Minus();
			}
		}

		return returnVal;
	}

	@Override
	public void run() {
		MainExecutor.randomSelection(1000);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int numberOfThreads = 6;

		Thread[] threadArr = new Thread[numberOfThreads];

		for (int i = 0; i < numberOfThreads; i++) {
			threadArr[i] = new Thread(new MainExecutor());
			threadArr[i].start();
		}

		for (int i = 0; i < numberOfThreads; i++) {
			try {
				threadArr[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("\nTest Done overall time = " + (end - start));
	}
}