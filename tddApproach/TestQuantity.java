package tddApproach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestQuantity {
	Quantity quan = new Quantity();
	
	@Test
	public void checknull() {
		assertNotNull(quan);
	}
	
	@Test
	public void checkEquality() {
		assertTrue(quan.checkEqual(1));
	}
	
	
	@Test
	public void testQuanFeet() {
		assertEquals(36, quan.convertFootToInch(3));
	}
	
	@Test
	public void testQuanYard() {
		assertEquals(6, quan.convertYardToFeet(2));
	}
	
	@Test
	public void testQuanInch() {
		Quantity quan = new Quantity();
		assertEquals(36, quan.convertYardToInch(1));
	}

}
