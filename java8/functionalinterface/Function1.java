package functionalinterface;

import java.util.function.Function;

public class Function1 {
	public static void main(String[] args) { 
		 Function<String, Integer> f = s ->s.length(); 
		 System.out.println(f.apply("Durga"));
		 System.out.println(f.apply("Soft")); 
		 } 
}
