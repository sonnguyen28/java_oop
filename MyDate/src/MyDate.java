import java.util.Scanner;
import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	private String[] strMonths = {"January", "February", "March", "April", "May", "June", "July", 
			"August", "September", "October", "November", "December"};
	private String[] strDays = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", 
			"16th", "17th", "18th", "19th", "20th", "21th", "22th", "23th", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
	
	//Ham tra ve so ngay cua mot thang
	public static int getMonthLastDay(int year, int month) {
		int monthLastDay = 0;
		switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        	monthLastDay = 31;
        	break;
        case 4: case 6: case 9: case 11:
        	monthLastDay = 30;
        	break;
        case 2:
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) monthLastDay = 29;
            else monthLastDay = 28;  
            break;
		}
		return monthLastDay;
	}
	// Kiem tra xem ngay nhap vao co hop le khong
	public boolean checkDate(int day, int month, int year) {
		return (1 <= year && year <= 9999) && (1 <= month && month <= 12) && (1 <= day && day <= getMonthLastDay(year, month));
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 1 || year > 9999) {
			System.out.println("Nam khong hop le !\n");
			return;
		}
		this.year = year;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("Thang khong hop le !\n");
			return;
		}
		this.month = month;
	}
	public void setDay(int day) {
		if (day < 1 || day > getMonthLastDay(this.year, this.month)) {
			System.out.println("Ngay khong hop le !\n");
			return;
		}
		this.day = day;
	}
	
	//Khoi tao khong co tham so tu gan gia tri la ngay hien tai
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		
		setYear(cal.get(Calendar.YEAR));
		setMonth(cal.get(Calendar.MONTH)+1);
		setDay(cal.get(Calendar.DATE));
	}
	
	public MyDate(int day, int month, int year) {
		super();
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public MyDate(String date) {
		super();
		String myDay, myMonth, myYear;
		Scanner sc = new Scanner(date);
		myMonth = sc.next();
		myDay = sc.next();
		myYear = sc.next();
		setYear(Integer.parseInt(myYear));
		for (int i = 0; i < strMonths.length; i++) {
			if(this.strMonths[i].equals(myMonth) == true) { 
				setMonth(i+1);
				break;
			}
		}
		for (int i = 0; i < strDays.length; i++) {
			if(this.strDays[i].equals(myDay) == true) { 
				setDay(i+1);
				break;
			}
		}
		sc.close();
	}
	
	// Yeu cau nguoi dung nhap vao mot ngay dang String
	public void accept() {
		System.out.print("Nhap vao mot ngay (vd: February 18th 2019): ");
		String myDay, myMonth, myYear;
		Scanner sc = new Scanner(System.in);
		myMonth = sc.next();
		myDay = sc.next();
		myYear = sc.next();
		sc.close();
		int i;
		for (i = 0; i < strMonths.length; i++) {
			if(this.strMonths[i].equals(myMonth) == true) { 
				//setMonth(i+1);
				break;
			}
		}
		int j;
		for (j = 0; j < strDays.length; j++) {
			if(this.strDays[j].equals(myDay) == true) { 
				//setDay(j+1);
				break;
			}
		}
		// Ngay hop le thi nhap vao 3 thuoc tinh
		// Khong hop le thi 3 thuoc tinh giu nguyen gia tri mac dinh la ngay hom nay
		if(checkDate(j+1,i+1,Integer.parseInt(myYear))) {
			setYear(Integer.parseInt(myYear));
			setMonth(i+1);
			setDay(j+1);
		}else {
			System.out.println("Ngay or Thang or Nam khong hop le!");
			System.out.println("Ngay in ra mac dinh la ngay hom nay: ");
		}
	}
	
	//Hien ngay da duoc luu lai
	public void print() {
		if(checkDate(getDay(), getMonth(), getYear())) {
			System.out.println("=>" + getDay() + "/" + getMonth() + "/" + getYear() + " (" + this.strMonths[getMonth()-1] + " " + this.strDays[getDay()-1] + " " + this.year + ")");
			System.out.println("------------------------------------------");
		}
	}
}