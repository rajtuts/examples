package LambdaExpr;

interface Interfa {
	public void methodOne();

}
class WithLambda1 {
	public static void main(String[] args) {
		Interfa i = () -> System.out.println("MethodOne Execution");
		i.methodOne();
	}
}