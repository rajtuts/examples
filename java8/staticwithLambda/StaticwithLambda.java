package staticwithLambda;

interface Interf {
	public static void sum(int a, int b) {
		System.out.println("The Sum:" + (a + b));
	}
}

class StaticwithLambda implements Interf {
	public static void main(String[] args) {
		StaticwithLambda t = new StaticwithLambda();
//		t.sum(10, 20); // CE
//		Test.sum(10, 20); // CE
		Interf.sum(10, 20);
	}
}