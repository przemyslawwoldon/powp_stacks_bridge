package edu.kis.vh.stacks.list;

public class Node {

	private int value;//w miejscu odwolania sie do tego atrybutu pojawila sie metoda
	private Node prev;//w miejscu odwolania sie do tego atrybutu pojawila sie metoda
	private Node next;//w miejscu odwolania sie do tego atrybutu pojawila sie metoda

	protected Node(int i) {
		value = i;
	}

	protected int getValue() {
		return value;
	}

	protected void setValue(int value) {
		this.value = value;
	}

	protected Node getPrev() {
		return prev;
	}

	protected void setPrev(Node prev) {
		this.prev = prev;
	}

	protected Node getNext() {
		return next;
	}

	protected void setNext(Node next) {
		this.next = next;
	}

}
