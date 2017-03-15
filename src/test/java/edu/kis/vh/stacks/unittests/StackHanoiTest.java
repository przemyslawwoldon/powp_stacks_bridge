package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {

	@Test
	public void testPush() {
		StackHanoi stackHanoi = new StackHanoi();
		int testValue = 4;
		stackHanoi.push(testValue);
		int result = stackHanoi.top();

		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testReportRejected() {
		StackHanoi stackHanoi = new StackHanoi();
		int result = stackHanoi.reportRejected();
		int expectedRejected = 0;
		
		Assert.assertEquals(expectedRejected, result);
		int testValue = 4;
		stackHanoi.push(testValue);
		result = stackHanoi.reportRejected();

		Assert.assertEquals(expectedRejected, result);
		testValue = 2;
		stackHanoi.push(testValue);
		result = stackHanoi.reportRejected();

		Assert.assertEquals(expectedRejected, result);
		expectedRejected = 1;
		testValue = 5;
		stackHanoi.push(testValue);
		result = stackHanoi.reportRejected();
		
		Assert.assertEquals(expectedRejected, result);
	}

}
