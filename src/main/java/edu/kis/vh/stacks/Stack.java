package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.list.StackList;
import edu.kis.vh.stacks.collections.list.StackVector;

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


//Navigate -> Open Declaration (F3) na wywolaniach metod 
//przenosi do interfejsu StackVector, do deklaracji metody
//
//Navigate -> Quick Type Hierarchy (ctrl+t) na wywolaniach metod
//prezentuje w okienku interfejs oraz klasy ktore go implementuja;
//po wybraniu interfejsu zostajemy przeniesieni do niego i do odpowiedniej deklaracji metody,
//zas po wybraniu ktorejs z klas implementujacych interfejs 
//zostajemy przeniesieni do tej klasy i do implementacji metody
//
//Nacisniety ctrl przy pracy kursora myszki 
//dziala tak samo jak F3


