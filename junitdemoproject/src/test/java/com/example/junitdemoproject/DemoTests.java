package com.example.junitdemoproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @BeforeAll ---> BeforeEach--->Test--->AfterEach--->AfterAll

class DemoTests {
	
	Mathematics math;
	
	@BeforeAll
	public static void setup() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void destroy() {
		System.out.println("After All");
	}
	
	@BeforeEach
	public void createMathsObject() {
		math = new Mathematics();
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void removeMathsObject() {
		math = null;
		System.out.println("After Each");
	}

	@Test
	public void whenBothArePositive() {
		//Mathematics math = new Mathematics();
		System.out.println("Inside the test method- Both Positive numbers");
		assertEquals(10, math.add(5, 5));
	}
	
	@Test
	public void whenBothAreNegative() {
		System.out.println("Inside the test method - Both Negative numbers");
		//Mathematics math = new Mathematics();
		assertEquals(-10, math.add(-5, -5));
	}
	
	@Test	
	public void whenBothAreZero() {
		//Mathematics math = new Mathematics();
		System.out.println("Inside the test method - Both Zero numbers");
		assertEquals(0, math.add(0, 0));
	}
	
	@Test
	@Tag("smoke")
	public void whenOnePositiveAndOneNegative() {
		System.out.println("Inside the test method - One Positive and One Negative number");
		//Mathematics math = new Mathematics();
		assertEquals(0, math.add(5, -5));
	}
	
    @Test
    @Tag("sanity")
 	public void testDivide() {
		//Mathematics math = new Mathematics();
    	System.out.println("Inside the test method - Divide");
		assertEquals(2, math.divide(10, 5));
	}

  
    @Test
        public void testDivideByZero() {
    	      //  Mathematics math = new Mathematics();
    	System.out.println("Inside the test method - Divide by Zero Exception");
    	        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    	}
}
	


