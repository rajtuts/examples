package datetime;

import java.time.Year;

public class LeapYear {
	public static void main(String[] args) {
		int n = Integer.parseInt("2021"); 
		Year y = Year.of(n); 
		if(y.isLeap()) 
		System.out.printf("%d is Leap year",n); 
		else 
		System.out.printf("%d is not Leap year",n);
	}
}
