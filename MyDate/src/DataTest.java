public class DataTest {

	public static void main(String[] args) {
		// Khoi tao khong tham so (Ngay mac dinh duoc khoi tao la ngay hom nay)
		System.out.println("Ngay hom nay !");
		MyDate currentDate = new MyDate();
		currentDate.print();
		
		// Khoi tao voi 3 tham so (ngay, thang, nam)
		// 1. Tham so sai
		System.out.println("Khoi tao MyDate(31, 2, 2021)!");
		MyDate myDate1 = new MyDate(31, 2, 2021);
		myDate1.print();
		// 2. Tham so dung
		System.out.println("Khoi tao MyDate(21, 10, 2021)!");
		MyDate myDate2 = new MyDate(21, 10, 2021);
		myDate2.print();
		
		// Khoi tao voi tham so String
		//1. Tham so sai
		System.out.println("Khoi tao MyDate(\"February 31st 2019\") !");
		MyDate myDate3 = new MyDate("February 31st 2019");
		myDate3.print();
		//2. Tham so dung
		System.out.println("Khoi tao MyDate(\"February 28th 2019\") !");
		MyDate myDate4 = new MyDate("February 28th 2019");
		myDate4.print();
		
		//Yeu cau nguoi dung nhap vao mot chuoi VD: February 18th 2019
		// Neu ngay hop le thi ngay duoc in ra la ngay nhap vao
		// Neu ngay khong hop le thi ngay duoc in ra la hom nay
		MyDate myDate5 = new MyDate();
		myDate5.accept();
		myDate5.print();
	}

}
