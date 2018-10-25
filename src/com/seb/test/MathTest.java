package com.seb.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.seb.main.*;

public class MathTest {
	SebMath math;

	@Before
	public void setUp() throws Exception {
		math = new SebMath(7, 10);
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(17, math.add());
	}

}
