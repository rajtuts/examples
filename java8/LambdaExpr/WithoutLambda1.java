package LambdaExpr;

interface Interf {
	public void methodOne();
}

class Demo implements Interf {
	public void methodOne() {
		System.out.println("method one execution");
	}
}

public class WithoutLambda1 {
	public static void main(String[] args) {
		Interf i = new Demo();
		i.methodOne();
	}
}
