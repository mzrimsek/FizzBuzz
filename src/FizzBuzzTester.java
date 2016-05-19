import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTester {
	
	private FizzBuzz fizzbuzz;
	
	@Before
	public void setUp(){
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void test3Fizz() {
		assertEquals(true, fizzbuzz.fizz(3));
	}
	
	@Test
	public void test3Buzz() {
		assertEquals(false, fizzbuzz.buzz(3));
	}
	
	@Test
	public void test3FizzBuzz() {
		assertEquals(false, (fizzbuzz.fizz(3) && fizzbuzz.buzz(3)));
	}
	
	@Test
	public void test5Fizz() {
		assertEquals(false, fizzbuzz.fizz(5));
	}
	
	@Test
	public void test5Buzz() {
		assertEquals(true, fizzbuzz.buzz(5));
	}
	
	@Test
	public void test7Fizz() {
		assertEquals(false, fizzbuzz.fizz(7));
	}
	
	@Test
	public void test7Buzz() {
		assertEquals(false, fizzbuzz.buzz(7));
	}
	
	@Test
	public void test13Fizz() {
		assertEquals(true, fizzbuzz.fizz(13));
	}
	
	@Test
	public void test13Buzz() {
		assertEquals(false, fizzbuzz.buzz(13));
	}
	
	@Test
	public void test35Fizz() {
		assertEquals(true, fizzbuzz.fizz(35));
	}
	
	@Test
	public void test35Buzz() {
		assertEquals(true, fizzbuzz.buzz(35));
	}
	
	@Test
	public void test30Fizz() {
		assertEquals(true, fizzbuzz.fizz(30));
	}
	
	@Test
	public void test30Buzz() {
		assertEquals(true, fizzbuzz.buzz(30));
	}
	
	@Test
	public void test51Fizz() {
		assertEquals(true, fizzbuzz.fizz(51));
	}
	
	@Test
	public void test51Buzz() {
		assertEquals(true, fizzbuzz.buzz(51));
	}

}
