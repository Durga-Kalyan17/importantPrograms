package test;

import java.text.MessageFormat;
import java.util.Date;

public class MessageFormatDemo {

	public static void main(String[] args) {
		
		int planet = 7;
		String event = "Party";
		
		String result = MessageFormat.format("At {1, time} on {1, date}, there was a {2} on planet {0}", planet, new Date(), event);

		System.out.println(result);
	}

}
