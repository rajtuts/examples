package streams;

import java.util.*;
import java.util.stream.*;

class MapStream {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("rvk");
		l.add("rk");
		l.add("rkv");
		l.add("rvki");
		l.add("rvkir");
		System.out.println(l);
		List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
	}
}