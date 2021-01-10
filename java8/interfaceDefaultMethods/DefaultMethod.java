package interfaceDefaultMethods;

interface Interf {
	default void m1() {
		System.out.println("Default Method");
	}
}

interface Interf2 {
	// can’t override object class methods as default methods inside interface
//	default int hashCode() { 
//		return 10; 
//	}
}

interface Left {
	default void m1() {
		System.out.println("Left Default Method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right Default Method");
	}
}

class DefaultMethod2 implements Left, Right {
	public void m1() {
		System.out.println("Test Class Method"); 
		Right.super.m1();
	}

	public static void main(String[] args) {
		DefaultMethod2 t = new DefaultMethod2();
		t.m1();
		
	}
}

class DefaultMethod implements Interf {
	public static void main(String[] args) {
		DefaultMethod t = new DefaultMethod();
		t.m1();
	}
}