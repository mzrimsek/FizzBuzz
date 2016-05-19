import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTester {
	
	private FizzBuzz fizzbuzz;

	@Test
	public void test3Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.fizz(3));
	}
	
	@Test
	public void test3Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(false, fizzbuzz.buzz(3));
	}
	
	@Test
	public void test3FizzBuzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(false, (fizzbuzz.fizz(3) && fizzbuzz.buzz(3)));
	}
	
	@Test
	public void test5Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(false, fizzbuzz.fizz(5));
	}
	
	@Test
	public void test5Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.buzz(5));
	}
	
	@Test
	public void test7Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(false, fizzbuzz.fizz(7));
	}
	
	@Test
	public void test7Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(false, fizzbuzz.buzz(7));
	}
	
	@Test
	public void test13Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.fizz(13));
	}
	
	@Test
	public void test13Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(false, fizzbuzz.buzz(13));
	}
	
	@Test
	public void test35Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.fizz(35));
	}
	
	@Test
	public void test35Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.buzz(35));
	}
	
	@Test
	public void test30Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.fizz(30));
	}
	
	@Test
	public void test30Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.buzz(30));
	}
	
	@Test
	public void test51Fizz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.fizz(51));
	}
	
	@Test
	public void test51Buzz() {
		fizzbuzz = new FizzBuzz();
		assertEquals(true, fizzbuzz.buzz(51));
	}

}
