package predicates;

import java.util.function.Predicate;

class Predicate1 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(100));
		System.out.println(p.test(7));
		// System.out.println(p.test(true)); // CE
		Predicate<String> p1 = s -> (s.length() > 3);
		System.out.println(p1.test("rvkb")); // true
		System.out.println(p1.test("rk")); // false
		//Predicate<Collection> p3 = c -> c.isEmpty();
		
	}
}