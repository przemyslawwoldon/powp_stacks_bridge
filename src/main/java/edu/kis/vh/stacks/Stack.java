package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Przemyslaw
 *
 */
public class Stack {

	private StackVector stackList;

	public Stack(StackList stackArray) {
		super();
		this.stackList = stackArray;
	}
	
	public Stack() {
		this.stackList = new StackList();
	}

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}
	
	public int getTotal() {
		return stackList.getTotal();
	}
	
}

//brak widocznych zmian w wykorzystaniu klasy Stack (StackDemo, Testach);
//mozliwosc uzycia w klasie Stack klas 
//implementujacych ten sam interfejs (StackVector) tj. klasy StackList lub klasy StackArray  
