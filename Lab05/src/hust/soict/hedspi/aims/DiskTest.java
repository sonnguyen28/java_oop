package hust.soict.hedspi.aims;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {

	public static void main(String[] args) {
		// Test "search" trong DigitalVideoDisc
		System.out.println("Tao dvd4 de test search !");
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tom and Jerry");
		dvd4.setCategory("Anmation");
		dvd4.setCost(25f);
		dvd4.setDirector("William Hanna");
		dvd4.setLength(90);
		System.out.println("  => " + dvd4.toString());
		System.out.println("Ket qua tra ve cua dvd4.search(tom JERRY): " + dvd4.search("tom JERRY"));
		System.out.println("Ket qua tra ve cua dvd4.search(TOMMM jerry): " + dvd4.search("TOMMM jerry"));
		System.out.println("\n****************************************\n");

		
		System.out.println("Tao Order1 va nhap vao 3 dvd!");
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Anmation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("Georger Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Anmation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.printOrder();
		
		
		Scanner sc = new Scanner(System.in);
		String tmp;
		System.out.print("Ban co muon Random free 1 DVD(yes/no): ");
		tmp = sc.next();
		sc.close();
		if(tmp.equalsIgnoreCase("yes")) {
			DigitalVideoDisc freeItem = anOrder.getALuckyItem();
			anOrder.removeDigitalVideoDisc(freeItem); // remove dvd duoc khuyen mai va update lai thong tin hoa don
			System.out.println("Thong tin hoa don sau khi KM");
			anOrder.printOrder();
		}else {
			System.out.println("WHAT ??? Khong nhan KM a ???");
			System.exit(1);
		}

	}

}
