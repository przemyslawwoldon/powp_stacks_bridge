package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.list.StackList;
import edu.kis.vh.stacks.collections.list.StackVector;

/**
 * @author Przemyslaw
 *
 */
public class Stack {

	private StackVector stackVector;

	public Stack(StackVector stackVector) {
		super();
		this.stackVector = stackVector;
	}
	
	public Stack() {
		this.stackVector = new StackList();
	}

	public void push(int i) {
		stackVector.push(i);
	}

	public boolean isEmpty() {
		return stackVector.isEmpty();
	}

	public boolean isFull() {
		return stackVector.isFull();
	}

	public int top() {
		return stackVector.top();
	}

	public int pop() {
		return stackVector.pop();
	}
	
	public int getTotal() {
		return stackVector.getTotal();
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


