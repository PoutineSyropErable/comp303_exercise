package ch3;

public class Pair<T> {
	private T aFirst;
	private T aSecond;

	public Pair(T pFirst, T pSecond) {
		aFirst = pFirst;
		aSecond = pSecond;
	}

	public T getFirst() {
		return aFirst;
	}

	public T getSecond() {
		return aSecond;
	}
}
