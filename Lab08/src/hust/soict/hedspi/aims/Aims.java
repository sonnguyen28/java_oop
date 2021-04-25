package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		Thread newThread = new Thread(new MemoryDemon());
		newThread.setDaemon(true);
		newThread.start();
		int currentOrder = 0;
		Order[] listOrder =  new Order[10];
		int idItems = 0;
		System.out.println("Order Management Application: "); 
		int menu;
		Scanner sc = new Scanner(System.in);
		boolean checkMenu = true;
		do {System.out.println("--------------------------------"); 
			System.out.println("1. Create new order"); 
			System.out.println("2. Add item to the order"); 
			System.out.println("3. Delete item by id");
			System.out.println("4. Display the items list of order"); 
			System.out.println("0. Exit"); 
			System.out.println("--------------------------------"); 
			System.out.print("Please choose a number: ");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				listOrder[currentOrder] = new Order();
				currentOrder++;
				idItems = 0;
				System.out.println("Da tao thanh cong ! Order" + currentOrder);
				break;
			case 2:
				int menu2;
				boolean checkMenu2 = true;
				do {
					System.out.println("--------------------------------"); 
					System.out.println("1. Book");
					System.out.println("2. DVD"); 
					System.out.println("3. CompactDisc");
					System.out.println("--------------------------------"); 
					System.out.print("Please choose a number: ");
					menu2 = sc.nextInt();
					sc.nextLine();
					switch (menu2) {
					case 1:
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
						idItems++;
						book1.setId(idItems);
						listOrder[currentOrder-1].addMedia(book1);
						checkMenu2 = false;
						break;
					case 2:
						System.out.print("Title DVD: ");
						DigitalVideoDisc dvd1 = new DigitalVideoDisc(sc.nextLine());
						System.out.print("Category dvd: ");
						dvd1.setCategory(sc.nextLine());
						System.out.print("Cost DVD: ");
						dvd1.setCost(sc.nextFloat());
						sc.nextLine();
						System.out.print("Director DVD: ");
						dvd1.setDirector(sc.nextLine());
						System.out.print("Length DVD: ");
						dvd1.setLength(sc.nextInt());
						sc.nextLine();
						idItems++;
						dvd1.setId(idItems);
						listOrder[currentOrder-1].addMedia(dvd1);
						System.out.println("--------------------------------"); 
						System.out.println("1. Play");
						System.out.println("2. Khong play"); 
						System.out.println("--------------------------------");
						boolean checkMenuPlayDVD = true;
						do {
							System.out.print("Please choose a number: ");
							int menuDVD;
							menuDVD = sc.nextInt();
							switch (menuDVD) {
							case 1:
								dvd1.play();
								checkMenuPlayDVD = false;
								break;
							case 2:
								checkMenuPlayDVD = false;
								break;
							default:
								System.out.println("Nhap sai !");
								break;
							}
						} while (checkMenuPlayDVD);
						checkMenu2 = false;
						break;
					case 3:
						System.out.print("Title CD: ");
						CompactDisc comdvd1 = new CompactDisc(sc.nextLine());
						System.out.print("Category CD: ");
						comdvd1.setCategory(sc.nextLine());
						System.out.print("Cost CD: ");
						comdvd1.setCost(sc.nextFloat());
						sc.nextLine();
						System.out.print("Director CD: ");
						comdvd1.setDirector(sc.nextLine());
						System.out.print("Artist CD: ");
						comdvd1.setArtist(sc.nextLine());
						boolean checkMenuAddTrack = true;
						int countTrack = 0;
						do {
							System.out.println("--------------------------------"); 
							System.out.println("1. Them mot Track");
							System.out.println("2. Exit");
							System.out.println("--------------------------------"); 
							System.out.print("Please choose a number: ");
							int menuAddTrack;
							menuAddTrack = sc.nextInt();
							sc.nextLine();
							switch (menuAddTrack) {
							case 1:
								System.out.print("Title Track: ");
								Track newTrack = new Track(sc.nextLine());
								System.out.print("Length Track: ");
								newTrack.setLength(sc.nextInt());
								sc.nextLine();
								comdvd1.addTrack(newTrack);
								countTrack++;
								break;
							case 2:
								checkMenuAddTrack = false;
								break;
							default:
								System.out.println("Nhap sai !");
								break;
							}
							if(countTrack == 0) {
								checkMenuAddTrack = true;
								System.out.println("Hay nhap it nhat mot Track !");
							}
						} while ((checkMenuAddTrack == false && countTrack == 0) || checkMenuAddTrack == true);
						idItems++;
						comdvd1.setId(idItems);
						listOrder[currentOrder-1].addMedia(comdvd1);
						System.out.println("--------------------------------"); 
						System.out.println("1. Play");
						System.out.println("2. Khong play"); 
						System.out.println("--------------------------------");
						boolean checkMenuPlayCD = true;
						do {
							System.out.print("Please choose a number: ");
							int menuDVD;
							menuDVD = sc.nextInt();
							switch (menuDVD) {
							case 1:
								comdvd1.play();
								checkMenuPlayCD = false;
								break;
							case 2:
								checkMenuPlayCD = false;
								break;
							default:
								System.out.println("Nhap sai !");
								break;
							}
						} while (checkMenuPlayCD);
						checkMenu2 = false;
						break;
					case 4:
						checkMenu2 = false;
						break;
					default:
						System.out.println("Nhap sai");
						break;
					}
				} while (checkMenu2);
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
				try {
					listOrder[currentOrder-1].print();
				} catch (Exception e) {
					System.out.println("Danh sach Order hien dang trong !!!");
				}
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
