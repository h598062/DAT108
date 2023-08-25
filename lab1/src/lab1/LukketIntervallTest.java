package lab1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LukketIntervallTest {

	@Test
	void testMinste() {
		Intervall<Integer> intervall = new LukketIntervall<>(10, 15);
		assertEquals(intervall.minste(), 10);
	}

	@Test
	void testStoerste() {
		Intervall<Integer> intervall = new LukketIntervall<>(10, 15);
		assertEquals(intervall.stoerste(), 15);
	}

	@Test
	void testIntervalliIntervall(){
		Intervall<Integer> intervall1 = new LukketIntervall<>(10, 15);
		Intervall<Integer> intervall2 = new LukketIntervall<>(5, 11);
		Intervall<Integer> intervall3 = new LukketIntervall<>(6, 9);
		assertTrue(intervall1.erIIntervall(intervall2));
		assertFalse(intervall1.erIIntervall(intervall3));
		assertTrue(intervall2.erIIntervall(intervall3));
		assertTrue(intervall2.erIIntervall(intervall1));
		assertFalse(intervall3.erIIntervall(intervall1));
		assertTrue(intervall3.erIIntervall(intervall2));
	}

	@Test
	void testVerdiiIntervall(){
		Intervall<Integer> intervall = new LukketIntervall<>(10, 15);
		assertTrue(intervall.erIIntervall(10));
		assertTrue(intervall.erIIntervall(12));
		assertTrue(intervall.erIIntervall(15));
		assertFalse(intervall.erIIntervall(9));
		assertFalse(intervall.erIIntervall(16));
		assertFalse(intervall.erIIntervall(100));
		assertFalse(intervall.erIIntervall(-9));
	}

}
