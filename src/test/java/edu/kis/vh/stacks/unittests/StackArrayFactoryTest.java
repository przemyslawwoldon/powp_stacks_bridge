package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.StackArrayFactory;

public class StackArrayFactoryTest {
	
	@Test
	public void testGetStandardStack() {
		StackArrayFactory stackArrayFactory = new StackArrayFactory();
		Object object = stackArrayFactory.getStandardStack();
		
		Assert.assertTrue(object instanceof Stack);
	}
		
	@Test
	public void testGetFalseStack() {
		StackArrayFactory stackArrayFactory = new StackArrayFactory();
		Object object = stackArrayFactory.getFalseStack();

		Assert.assertTrue(object instanceof Stack);
	}

	@Test
	public void testGetFIFOStack() {
		StackArrayFactory stackArrayFactory = new StackArrayFactory();
		Object object = stackArrayFactory.getFIFOStack();
		
		Assert.assertTrue(object instanceof StackFIFO);
	}

	@Test
	public void testGetHanoiStack() {
		StackArrayFactory stackArrayFactory = new StackArrayFactory();
		Object object = stackArrayFactory.getHanoiStack();
		
		Assert.assertTrue(object instanceof StackHanoi);
	}
	
}
