package LambdaExpr;

interface Interf3 {
	public void square(int a);
}

class Demo3 implements Interf3 {
	public void square(int x) {
		System.out.println("The sum::"+(x*x));
	}
}

public class WithoutLambda3 {
	public static void main(String[] args) {
		Interf3 i = new Demo3();
		i.square(5);
	}
}
