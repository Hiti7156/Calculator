package cal_demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalsiTesting {

	@Test
	public void addtest() {
		Calculator c1 = new Calculator();
		int result = c1.add(10, 20);
		assertEquals(30,result);
	}

	@Test
	public void multiplications() {
		Calculator c1 = new Calculator();
		int result = c1.multiplications(40, 2);
		assertEquals(80,result);
	}
	
	@Test
	public void subtract() {
		Calculator c1 = new Calculator();
		int result = c1.subtract(50, 20);
		assertEquals(30,result);
	}

	@Test
	public void div() {
		Calculator c1 = new Calculator();
		int result = c1.div(10,2);
		assertEquals(5,result);
	}

	
}
