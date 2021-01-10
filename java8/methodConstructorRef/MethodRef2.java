package methodConstructorRef;

interface Interf {
	public void m1(int i);
}

class MethodRef2 {
	public void m2(int i) {
		System.out.println("From Method Reference:" + i);
	}

	public static void main(String[] args) {
		Interf f = i -> System.out.println("From Lambda Expression:" + i);
		f.m1(10);
		MethodRef2 t = new MethodRef2();
		Interf i1 = t::m2;
		i1.m1(20);
	}
}