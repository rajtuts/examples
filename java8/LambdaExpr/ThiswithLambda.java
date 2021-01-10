package LambdaExpr;

interface Interf4 {
	public void m1();
}

class ThiswithLambda {
	int x = 777;

	public void m2() {
		Interf4 i = () -> {
			int x = 888;
			System.out.println(x);// 888
			System.out.println(this.x); // 777
		};
		i.m1();
	}

	public static void main(String[] args) {
		ThiswithLambda t = new ThiswithLambda();
		t.m2();
	}
}