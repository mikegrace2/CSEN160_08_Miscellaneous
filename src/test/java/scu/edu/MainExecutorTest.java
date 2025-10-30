package scu.edu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import com.csen160.H_Profiling.Main.MainExecutor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainExecutorTest {
    @Test
    void test1_sum1() {
        try { // simulates some computation time
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(6, MainExecutor.sum(3,3));
    }

    @Test
    void test2_sum2() {
        try { // simulates some computation time
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(12, MainExecutor.sum(9,3));
    }

    @Test
    void test3_true() {
        try { // simulates some computation time
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean one=true;
        int val1=100;
        int val2=100;

        assertTrue(one);
        assertTrue(val1 == val2);
    }

    @Test
    void test4_false() {
        try { // simulates some computation time
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean one=false;
        int val1=100;
        int val2=100;

        assertFalse(one);
        assertFalse(val1 != val2);
    }

    @Test
    void test5_null() {
        try { // simulates some computation time
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MainExecutor ref=new MainExecutor();
        MainExecutor ref2=null;

        assertNotNull(ref);
        assertNull(ref2);
    }

    @Test
    void test6_array() {
        try { // simulates some computation time
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] array1= {
                10,20,30,40,50
        };

        int[] array2= {
                10,20,30,40,50
        };

        assertArrayEquals(array1, array2);
    }

    @Test
    void test7_exceptions() {
        try { // simulates some computation time
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            MainExecutor.reverseString(null);
            fail("Expected IllegalArgumentException!!");
        }catch(IllegalArgumentException ex) {
            // All good
        }
    }

    @Test
    void test8_exceptions() {
        try { // simulates some computation time
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertThrows(IllegalArgumentException.class, () ->{
            MainExecutor.reverseString(null);
        });
    }

    @DisplayName("Timeout test:")
    @Test
    void test9_timeout() {
        assertTimeout( Duration.ofDays(1), () ->{
            MainExecutor.reverseString(null);
        });
    }
}