package LambdaExpr;

interface Interf1 {
	public void m1();
}

class LocalVarswithLambda {
	int x = 10;

	public void m2() {
		int y = 20;
		Interf1 i = () -> {
			System.out.println(x);// 10
			System.out.println(y);// 20
			x = 888;
			//y = 999; // CE
		};
		i.m1();
		//y = 777;
	}

	public static void main(String[] args) {
		LocalVarswithLambda t = new LocalVarswithLambda();
		t.m2();
	}
}