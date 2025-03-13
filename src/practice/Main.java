package practice;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		BasicArray<Integer> array1 = new BasicArray<>(numbers);
		BasicArray<Integer> array2 = new BasicArray<>(new Integer[] { 1, 2, 3, 4, 5 });

		// ✅ Supports for-each loops
		System.out.print("\n\nElements: ");
		for (int num : array1) {
			System.out.print(num + " ");
		}
		System.out.println();

		// ✅ Comparison checks
		System.out.println("Arrays are equal: " + array1.equals(array2)); // true
		System.out.println("Hash codes: " + array1.hashCode() + ", " + array2.hashCode()); // Same hash
		System.out.println("Array contents: " + array1); // str() method

		System.out.println("\nMY linked list");
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Alice");
		list.add("Bob");
		list.add("Charlie");

		for (String name : list) { // ✅ Works correctly
			System.out.println(name);
		}

		System.out.println("\n\nNo Syntax Sugar:");
		Iterator<String> iterator = list.iterator(); // ✅ Get an iterator
		while (iterator.hasNext()) { // ✅ Check if more elements exist
			String name = iterator.next(); // ✅ Get the next element
			System.out.println(name); // ✅ Process the element
		}

	}
}
