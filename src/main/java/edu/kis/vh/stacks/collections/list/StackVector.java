package edu.kis.vh.stacks.collections.list;

public interface StackVector {

	int EMPTY_STACK_VALUE = 0;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}

//przeniesienie stalej z klas StackArray i StackList 
//znaczaco ulatwilo zmiane wartosci zwracanej z -1 na 0, w przypadku pustego stosu;
//zmiana tylko raz w interfejsie, nie trzeba bylo zmieniac tej wartosci w kazdej klasach osobno