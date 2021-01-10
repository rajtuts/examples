package staticwithLambda;

interface Interf1 {
	public static void m1() {
	}
	public static void m2() {
	}
	private void m3() {}
	
}

class NoOverride implements Interf1 {
	public static void m1() {
	}
	public void m2() {}
	public void m3() {}
}
