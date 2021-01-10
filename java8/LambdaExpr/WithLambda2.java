package LambdaExpr;

interface Interfa2 {
	public void sum(int a,int b);

}
class WithLambda2 {
	public static void main(String[] args) {
		Interfa2 i = (a,b) -> System.out.println("The sum::"+(a+b));
		i.sum(5,6);
	}
}