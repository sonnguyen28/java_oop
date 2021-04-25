package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		
		int currentOrder = 0;
		Order[] listOrder =  new Order[10];
		
		System.out.println("Order Management Application: "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Create new order"); 
		System.out.println("2. Add item to the order"); 
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order"); 
		System.out.println("0. Exit"); 
		System.out.println("--------------------------------"); 
		
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean checkMenu = true;
		do {
			System.out.print("Please choose a number: ");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				listOrder[currentOrder] = new Order();
				currentOrder++;
				System.out.println("Da tao thanh cong ! Order" + currentOrder);
				break;
			case 2:
				System.out.print("Nhap vao loai item (Book/DVD): ");
				String nameItem = sc.nextLine();
				if(nameItem.equalsIgnoreCase("Book")) {
					System.out.print("Title book: ");
					Book book1 = new Book(sc.nextLine());
					System.out.print("Category book: ");
					book1.setCategory(sc.nextLine());
					System.out.print("Cost book: ");
					book1.setCost(sc.nextFloat());
					sc.nextLine();
					System.out.print("Author book: ");
					String strAuthors = sc.nextLine();
					//Them cac tac gia cua sach vao trong List authors cua Book
					String[] listAuthors = strAuthors.split(", ");
					for (String author : listAuthors) {
						book1.addAuthor(author);
					}
					listOrder[currentOrder-1].addMedia(book1);
				}
				if(nameItem.equalsIgnoreCase("DVD")) {
					System.out.print("Title DVD: ");
					DigitalVideoDisc dvd1 = new DigitalVideoDisc(sc.nextLine());
					System.out.print("Category DVD: ");
					dvd1.setCategory(sc.nextLine());
					System.out.print("Cost DVD: ");
					dvd1.setCost(sc.nextFloat());
					sc.nextLine();
					System.out.print("Director DVD: ");
					dvd1.setDirector(sc.nextLine());
					System.out.print("Length DVD: ");
					dvd1.setLength(sc.nextInt());
					sc.nextLine();
					listOrder[currentOrder-1].addMedia(dvd1);
				}
				break;
			case 3:
				try {
					System.out.print("Nhap vao id item: ");
					int idItem = sc.nextInt();
					listOrder[currentOrder-1].removeMedia(idItem);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Item khong ton tai trong order!");
				}
				break;
			case 4:
				listOrder[currentOrder-1].print();
				break;
			case 0:
				System.out.println("Hen gap lai !");
				System.exit(1);
				break;
			default:
				System.out.println("Nhap sai");
				break;
			}
		} while (checkMenu);
		sc.close();
	}
}
