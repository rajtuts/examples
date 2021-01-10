package LambdaExpr;

interface Interfa3 {
	public int square(int a);

}
class WithLambda3 {
	public static void main(String[] args) {
		Interfa3 i = x -> x*x;
		System.out.println(i.square(5));
	}
}