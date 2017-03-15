package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class DefaultStacksFactoryTest {

	@Test
	public void testGetStandardStack() {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		Object object = defaultStacksFactory.getStandardStack();

		Assert.assertTrue(object instanceof Stack);
	}
		
	@Test
	public void testGetFalseStack() {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		Object object = defaultStacksFactory.getFalseStack();

		Assert.assertTrue(object instanceof Stack);
	}

	@Test
	public void testGetFIFOStack() {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		Object object = defaultStacksFactory.getFIFOStack();
		
		Assert.assertTrue(object instanceof StackFIFO);
	}

	@Test
	public void testGetHanoiStack() {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		Object object = defaultStacksFactory.getHanoiStack();
		
		Assert.assertTrue(object instanceof StackHanoi);
	}

}
