package methodConstructorRef;

class Sample {
	private String s;

	Sample(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}

interface Interf1 {
	public Sample get(String s);
}

class ConstructorRef {
	public static void main(String[] args) {
		Interf1 f = s -> new Sample(s);
		f.get("From Lambda Expression");
		Interf1 f1 = Sample::new;
		f1.get("From Constructor Reference");
	}
}