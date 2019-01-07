package com.string;

import static org.junit.Assert.*;

import org.junit.Test;

import static java.time.Duration.ofMillis;

public class DemoTest {

	@Test
	public void testComapreString() {
		Demo demo = new Demo();
		// assertTrue(demo.comapreString("hello", "hello_false"));

		// msg comes when test case false otherwise
		assertTrue("hello fails", demo.comapreString("hello", "hello"));

	}

	@Test
	public void testConcatString() {
		Demo demo = new Demo();

		assertEquals("sandeeprai", demo.concatString("sandeep", "rai"));
	}

	@Test
	public void testAddOneToArray() {
		Demo demo = new Demo();
		assertArrayEquals(new int[] { 3, 4 }, demo.addOneToArray(new int[] { 2, 3 }));

	}

	@Test(timeout = 650)
	public void testPerformance() {
		Demo d = new Demo();

		d.performance();

	}

	@Test(expected = ArithmeticException.class)
	public void testAException() {
		Demo d = new Demo();

		d.aException(5);

	}

}
