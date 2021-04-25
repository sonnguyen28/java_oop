package hust.soict.hedspi.test.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DataTest {
	public static void main(String[] args) throws ParseException {
		System.out.println("Khoi tao ngay bang MyDate(String day, String month, String year)");
		System.out.println("VD: MyDate(\"SECOND\", \"February\", \"twenty nineteen\")");
		System.out.print("Ngay da duoc khoi tao la: \n=>");
		MyDate myDate1 = new MyDate("SECOND", "February", "twenty nineteen");
		myDate1.print();
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao dinh dang muon hien thi (VD:dd/MM/yyyy) : ");
		String formatDate = sc.next();
		myDate1.printFormatDate(formatDate);
		System.out.println("----------------------------------------");
		System.out.println("So sanh 2 ngay !");
		DateUtils myDate2 = new DateUtils();
		String strDate1, strDate2;
		
		System.out.print("Nhap vao date 1 (dd/MM/yyyy): ");
		strDate1 = sc.next();
		System.out.print("Nhap vao date 2 (dd/MM/yyyy): ");
		strDate2 = sc.next();
		myDate2.compareDates(strDate1, strDate2);
		System.out.println("----------------------------------------");
		sc.close();
		
		System.out.println("Tao mot mang Dates !");
		ArrayList<Date> listDates=new ArrayList<Date>();
		listDates.add(new SimpleDateFormat("dd/MM/yyyy").parse("30/01/2020"));
		listDates.add(new SimpleDateFormat("dd/MM/yyyy").parse("28/01/2020"));
		listDates.add(new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2020"));
		for (Date s : listDates)
		{
			SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
			
		    System.out.println(ft.format(s));
		}
		
		myDate2.sortDates(listDates);
		System.out.println("Sau khi sap xep !");
		for (Date s : listDates)
		{
			SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		
			System.out.println(ft.format(s));
		}
		
	}
	public Date StringToDateExample(String strdate) throws ParseException {
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(strdate);
			return date1;
	}
}
