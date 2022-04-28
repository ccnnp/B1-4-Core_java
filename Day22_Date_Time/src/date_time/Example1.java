package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example1 
{

	public static void main(String[] args) 
	{
		//LocalDate l=LocalDate.now();
		//LocalTime p=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate b=LocalDate.of(2022,Month.FEBRUARY, 28);
		//System.out.println(l);
		//System.out.println(p);
		System.out.println(dt);
	}

}
