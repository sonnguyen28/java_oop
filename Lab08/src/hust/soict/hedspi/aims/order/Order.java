package hust.soict.hedspi.aims.order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	
	public static final int MAX_LIMITTED_ORDERS = 2;
	
	private static int nbOrders = 0;
	
	private Date orderDay;
	
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media nameMedia) {
		if(itemsOrdered.size() <= MAX_NUMBER_ORDERED) {
			itemsOrdered.add(nameMedia);
			System.out.println("The item has been added");
		}else {
			System.out.println("The order is almost full");
		}
	}
	
	public void removeMedia(int idItem) {
		String titleOld = itemsOrdered.get(idItem-1).getTitle();
		try {
			itemsOrdered.remove(idItem-1);
			System.out.println("The " + titleOld + " has been removed");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Item khong co trong Ordered!");
		}
	}
	
	public float totalCost() {
		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		return (float) Math.ceil(total * 100) / 100;
	}

	public Order() {
		if(nbOrders < MAX_LIMITTED_ORDERS) {
			nbOrders++;
			this.orderDay = new Date();
		}else {
			System.out.println("Da dat gioi han don hang co the tao!");
			System.exit(1);
		}
	}
	
	public void print() {
		if(itemsOrdered.size() != 0) {
			System.out.println("\n***********************Order"+ nbOrders + "***********************");
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String strDateOrder = formatter.format(this.orderDay);
			System.out.println("Date: " + strDateOrder);
			System.out.println("Ordered Items:");
			for (int i = 0; i < itemsOrdered.size(); i++) {
				System.out.print(i + 1 + ". " + itemsOrdered.get(i).printInfo());
			} 
			System.out.println("Total cost: " + totalCost() + "$");
		}else {
			System.out.println("Danh sach Order hien dang trong !!!");
		}
		
	}
	
}
