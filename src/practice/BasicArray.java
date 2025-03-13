package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.NoSuchElementException;

public class BasicArray<T> implements Iterable<T> {
	private final T[] data;

	public BasicArray(T[] data) {
		this.data = Arrays.copyOf(data, data.length); // ✅ Copy array to prevent modification
	}

	@Override
	public Iterator<T> iterator() {
		// return Arrays.stream(data).iterator(); // ✅ Allows `for-each` iteration
		return new BasicArrayIterator();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // ✅ Same instance check
		if (obj == null || getClass() != obj.getClass())
			return false; // ✅ Ensure same class

		BasicArray<?> other = (BasicArray<?>) obj;
		return Arrays.equals(this.data, other.data); // ✅ Compare elements
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(data);
	}

	@Override
	public String toString() {
		return Arrays.toString(data); // ✅ Pretty print the array
	}

	private class BasicArrayIterator implements Iterator<T> {
		private int currentIndex;
		private final T[] iteratorData = data;

		@Override
		public T next() {
			// return current element, and change current = current.next();
			if (!hasNext())
				throw new NoSuchElementException();
			T out = data[currentIndex];
			currentIndex++;
			return out;
		}

		@Override
		public boolean hasNext() {
			// check if current element can be returned
			return currentIndex < iteratorData.length;
		}

	}

}
