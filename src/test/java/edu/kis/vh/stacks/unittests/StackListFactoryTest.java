package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.StackListFactory;

public class StackListFactoryTest {
	@Test
	public void testGetStandardStack() {
		StackListFactory stackListFactory = new StackListFactory();
		Object object = stackListFactory.getStandardStack();
		
		Assert.assertTrue(object instanceof Stack);
	}
		
	@Test
	public void testGetFalseStack() {
		StackListFactory stackListFactory = new StackListFactory();
		Object object = stackListFactory.getFalseStack();

		Assert.assertTrue(object instanceof Stack);
	}

	@Test
	public void testGetFIFOStack() {
		StackListFactory stackListFactory = new StackListFactory();
		Object object = stackListFactory.getFIFOStack();
		
		Assert.assertTrue(object instanceof StackFIFO);
	}

	@Test
	public void testGetHanoiStack() {
		StackListFactory stackListFactory = new StackListFactory();
		Object object = stackListFactory.getHanoiStack();
		
		Assert.assertTrue(object instanceof StackHanoi);
	}
}
