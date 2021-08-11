import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAPP {

	public static void main(String[] args) {
//		LocalDate date1=LocalDate.now();
//		LocalDate date2=LocalDate.of(6,20,2014);
//		LocalDate date3=LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
//		System.out.println(date1);
//		System.out.println(date2);
//		System.out.println(date3);

		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		
//		LocalDate dt = LocalDate.of(2012,1,30);
//		dt.plusDays(10);
//		System.out.println(dt);
		
//		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//		System.out.println(date);
	}

}
