package Default;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeEx1 {

	public static void main(String[] args) {
		LocalDate time = LocalDate.now();
		System.out.println(time);

		System.out.println(time.atStartOfDay());
		
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		
		LocalDateTime both = LocalDateTime.now();
		System.out.println(both);
	}

}
