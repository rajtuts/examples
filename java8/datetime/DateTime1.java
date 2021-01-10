package datetime;

import java.time.*;

public class DateTime1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime dt1 = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(dt1);
		LocalDateTime dt2 = LocalDateTime.of(1995, 04, 28, 12, 45);
		System.out.println(dt2);
		System.out.println("After six months:" + dt2.plusMonths(6));
		System.out.println("Before six months:" + dt2.minusMonths(6));
		LocalTime time2 = LocalTime.now();
		int h = time2.getHour();
		int m = time2.getMinute();
		int s = time2.getSecond();
		int n = time2.getNano();
		System.out.printf("\n%d:%d:%d:%d", h, m, s, n);

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1989, 06, 15);
		Period p = Period.between(birthday, today);
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());
	}
}