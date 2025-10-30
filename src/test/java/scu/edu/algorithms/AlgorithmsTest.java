package scu.edu.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import com.csen160.F_JUnit.Algorithms;
import org.junit.jupiter.api.Test;

class AlgorithmsTest {
	@Test
	void test1() {
		Algorithms myAlgorithms=new Algorithms();
		
		try { // simulates some computation time
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals(2.0, myAlgorithms.divide(6, 3));
	}

	@Test
	void test2() {
		Algorithms myAlgorithms=new Algorithms();
		
		try { // simulates some computation time
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals(18, myAlgorithms.multiply(6, 3));
	}

	@Test
	void test3() {
		Algorithms myAlgorithms=new Algorithms();
		
		try { // simulates some computation time
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals(3, myAlgorithms.subtract(6, 3));
	}

	@Test
	void test4() {
		Algorithms myAlgorithms=new Algorithms();
		
		try { // simulates some computation time
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals(9, myAlgorithms.sum(6, 3));
	}
}
