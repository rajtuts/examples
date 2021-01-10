package LambdaExpr;

interface Interf2 {
	public void sum(int a,int b);
}

class Demo2 implements Interf2 {
	public void sum(int a,int b) {
		System.out.println("The sum::"+(a+b));
	}
}

public class WithoutLambda2 {
	public static void main(String[] args) {
		Interf2 i = new Demo2();
		i.sum(5,6);
	}
}
