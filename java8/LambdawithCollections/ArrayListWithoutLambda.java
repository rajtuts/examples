package LambdawithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyEmpComparator implements Comparator<Employee1> {
	public int compare(Employee1 I1, Employee1 I2) {
		if (I1.eno < I2.eno) {
			return +1;
		} else if (I1.eno > I2.eno) {
			return -1;
		} else {
			return 0;
		}
	}
}

class Employee1 {
	int eno;
	String ename;

	Employee1(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + ":" + ename;
	}
}

class ArrayListWithoutLambda {
	public static void main(String[] args) {
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1(100, "Katrina"));
		l.add(new Employee1(600, "Kareena"));
		l.add(new Employee1(200, "Deepika"));
		l.add(new Employee1(400, "Sunny"));
		l.add(new Employee1(500, "Alia"));
		l.add(new Employee1(300, "Mallika"));
		System.out.println("Before Sorting:");
		System.out.println(l);
		Collections.sort(l, new MyEmpComparator());
		System.out.println("After Sorting:");
		System.out.println(l);
	}
}

