package hust.soict.hedspi.aims.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
public class DateUtils {
	
	public void compareDates(String strDate1, String strDate2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sdf.parse(strDate1);
	    Date date2 = sdf.parse(strDate2);
	    
	    if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 truoc Date2");
        } 
	    if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 sau Date2");
        } 
	    if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 bang to Date2");
        }
	}
	
	public void sortDates (ArrayList<Date> listDate) {
		Collections.sort(listDate, new Comparator<Date>() {
            @Override
            public int compare(Date object1, Date object2) {
                return object1.compareTo(object2);
            }
        });
	}
	
}
