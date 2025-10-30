package scu.edu.model;

import com.csen160.F_JUnit.Entity;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

class EnityTest {
	@Test
	void test1() {
		Entity myEntity=new Entity();
		
		try { // simulates some computation time
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertEquals(myEntity.numberOne, 100);
	}

	@Test
	void test2() {
		Entity myEntity=new Entity();
		
		try { // simulates some computation time
			Thread.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		assertEquals(myEntity.numberTwo, 300);		
	}

	@Test
	void test3() {
		Entity myEntity=new Entity();
		
		try { // simulates some computation time
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals(myEntity.init, "Hello World");		
	}

	@Test
	void test4() {
		Entity myEntity=new Entity();
		
		try { // simulates some computation time
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals(myEntity.division, 10.0);		
	}
}
