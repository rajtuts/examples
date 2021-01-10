package LambdawithCollections;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + ":" + ename;
	}
}

class ArrayListWithLambda {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(100, "Katrina"));
		l.add(new Employee(600, "Kareena"));
		l.add(new Employee(200, "Deepika"));
		l.add(new Employee(400, "Sunny"));
		l.add(new Employee(500, "Alia"));
		l.add(new Employee(300, "Mallika"));
		System.out.println("Before Sorting:");
		System.out.println(l);
		Collections.sort(l, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		System.out.println("After Sorting:");
		System.out.println(l);
	}
}
