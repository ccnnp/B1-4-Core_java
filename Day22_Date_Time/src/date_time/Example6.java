package date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) 
	{
		LocalTime t=LocalTime.now(ZoneId.of("Egypt"));
		LocalDateTime p=LocalDateTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(t);
		System.out.println(p);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
