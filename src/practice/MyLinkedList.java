package practice;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

	Node head;

	public MyLinkedList() {
		this.head = null;
	}

	public void add(T data) {

		if (head == null) {
			head = new Node(data);
			return;
		}

		Node current = head;
		while (current.hasNext()) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	@Override
	public Iterator<T> iterator() {
		return new MyLinkedListIterator();
	}

	private class Node {
		private T data;
		private Node next;

		public boolean hasNext() {
			return next != null;
		}

		public Node(T pData) {
			data = pData;
			next = null;
		}

	}

	private class MyLinkedListIterator implements Iterator<T> {
		private Node current = head;

		@Override
		public T next() {
			// returns current element and set current to current.next;
			if (!hasNext())
				throw new NoSuchElementException();
			T out = current.data;
			current = current.next;
			return out;
		}

		@Override
		public boolean hasNext() {
			// check if current can be returned;
			return current != null;
		}

	}

}
