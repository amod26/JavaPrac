
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;




public class Calender {
	public static void main(String[]args) {
		GregorianCalendar now = new GregorianCalendar();
		
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day= now.get(Calendar.DATE);
		int hour= now.get(Calendar.HOUR_OF_DAY);
		int minute= now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		JOptionPane.showMessageDialog(null,
				"It is now " + twoDigits.format(hour)+ ":"
				            + twoDigits.format(minute)+ ":"
				            + twoDigits.format(second)+ " on "
				            + twoDigits.format(day)+ "/"
				            + twoDigits.format(month)+ "/"
				            + year);
		
	}

}
