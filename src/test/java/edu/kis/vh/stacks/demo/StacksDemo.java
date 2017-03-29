package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;
import edu.kis.vh.stacks.factory.StacksFactory;

public class StacksDemo {

	private static final int SELECT_MAX_VALUE_OF_PUSH_ONE_STACK = 15;
	private static final int SIZE_HASHSET_OF_STACK = 3;
	private static final int RANDOM_TOP_BORDER = 20;

	public static void main(String[] args) {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		StackArrayFactory stackArrayFactory = new StackArrayFactory();
		StackListFactory stackListFactory = new StackListFactory();

		testStacks(defaultStacksFactory);
		testStacks(stackArrayFactory);
		testStacks(stackListFactory);
		
	}

	public static void testStacks(StacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };
		
		for (int i = 1; i < SELECT_MAX_VALUE_OF_PUSH_ONE_STACK; i++)
			for (int j = 0; j < SIZE_HASHSET_OF_STACK; j++)
				stacks[j].push(i);

		java.util.Random random = new java.util.Random();
		for (int i = 1; i < SELECT_MAX_VALUE_OF_PUSH_ONE_STACK; i++)
			stacks[SIZE_HASHSET_OF_STACK].push(random.nextInt(RANDOM_TOP_BORDER));
		
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
		System.out.println("total rejected is " + ((StackHanoi) stacks[SIZE_HASHSET_OF_STACK]).reportRejected());
	}

}
// linia 30 polaczenie w jedna linie System.out.println();
// usuniecie pustej linii 30, 28;
// wciecie linia 26;
// wciecie linii 19-27;
// usuniecie pustej linii 11;
// wciecie linia 12.

// alt+ <--, alt+ -->: sluza do przechodzenia pomiedzy ostatnio uzywanymi plikami
// alt+ <-- : dodatkowo mozliwe otwarcie pliku jesli zostal zamkniety
