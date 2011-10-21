package de.dubmas.modulob.util;

import java.util.ArrayList;
import java.util.List;

public class Indexed<T> {

	private T value;
	private int index;
	private boolean first;
	private boolean last;

	public T getValue() {
		return value;
	}

	public int getIndex0() {
		return index;
	}

	public int getIndex1() {
		return index + 1;
	}

	public boolean isFirst() {
		return first;
	}

	public boolean isLast() {
		return last;
	}

	public Indexed(T value, int index, boolean first, boolean last) {
		super();
		this.value = value;
		this.index = index;
		this.first = first;
		this.last = last;
	}

	public static <T> Iterable<Indexed<T>> indexed(Iterable<T> iterable) {
		List<T> liste = new ArrayList<T>();
		for (T t : iterable) {
			liste.add(t);
		}
		List<Indexed<T>> result = new ArrayList<Indexed<T>>();
		int counter = 0;
		for (T e : liste) {
			result.add(new Indexed<T>(e, counter, counter == 0, counter == liste.size() - 1));
			counter++;
		}
		return result;
	}

}