package streams;

import java.util.*;

class WithoutStreams {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (Integer i : l1) {
			if (i % 2 == 0)
				l2.add(i);
		}
		System.out.println(l2);
	}
}