package com.nissan.training.checkno;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void addtest() {
		Calc c=new Calc();
		assertEquals(5,c.add(2, 3));
		
	}
	@Test
	public void subtest() {
		Calc c=new Calc();
		assertEquals(5,c.sub(7, 2));
		
	}
	@Test
	public void multest() {
		Calc c=new Calc();
		assertEquals(10,c.mul(2, 5));
		
	}
	@Test
	public void divtest() {
		Calc c=new Calc();
		assertEquals(5,c.div(10, 2));
		
	}
	@Test
	public void modtest() {
		Calc c=new Calc();
		assertEquals(0,c.mod(10, 2));
		
	}
}
