package hust.soict.hedspi.aims.order;

import java.util.Date;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.text.SimpleDateFormat;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	
	public static final int MAX_LIMITTED_ORDERS = 2;
	
	private static int nbOrders = 0;
	
	private String dateOrder;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered < MAX_NUMBER_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
			this.qtyOrdered++;
			System.out.println("The disc has been added");
		}else {
			System.out.println("The order is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int i, j;
		for (j = 0,i = qtyOrdered ; i < MAX_NUMBER_ORDERED && j < dvdList.length; i++,j++) {
			addDigitalVideoDisc(dvdList[j]);
		}
		if(dvdList.length - j > 0) {
			System.out.println("Full ordered items !");
			System.out.println("List of items that cannot be added:");
			for (;j < dvdList.length; j++) {
				System.out.println(j+1 + "." + dvdList[j].getTitle());
			}
		}		
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(qtyOrdered + 2 - MAX_NUMBER_ORDERED <= 0) {
			addDigitalVideoDisc(dvd1);
			addDigitalVideoDisc(dvd2);
		}
		if(qtyOrdered + 2 - MAX_NUMBER_ORDERED == 1) {
			addDigitalVideoDisc(dvd1);
			System.out.println("The item quantity has reached its limit");
			System.out.println("The dvds that could not be added: ");
			System.out.println(dvd2.getTitle());
		}
		if(qtyOrdered + 2 - MAX_NUMBER_ORDERED == 2){
			System.out.println("The item quantity has reached its limit");
			System.out.println(dvd1.getTitle());
			System.out.println(dvd2.getTitle());
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i;
		for (i = 0; i < this.qtyOrdered; i++) {
			if(this.itemsOrdered[i].getTitle().equals(disc.getTitle()) == true) {
				for (int j = i; j < this.qtyOrdered; j++) {
					this.itemsOrdered[j] = this.itemsOrdered[j+1]; 
				}
				System.out.println("The " + disc.getTitle() + " has been removed");
				this.itemsOrdered[this.qtyOrdered] = null;
				this.qtyOrdered--;
				break;
			}
		}
		if(i == this.qtyOrdered) System.out.println("Phim khong co trong Ordered!");
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			total += this.itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void printOrder() {
		System.out.println("\n***********************Order"+ nbOrders + "***********************");
		System.out.println("Date: " + dateOrder);
		System.out.println("Ordered Items:");
		for (int i = 0; i < this.qtyOrdered; i++) {
			System.out.println(i+1 + ". " + "DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory()
					+ " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************\n");
	}

	public Order() {
		if(nbOrders < MAX_LIMITTED_ORDERS) {
			nbOrders++;
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			this.dateOrder = formatter.format(date);
		}else {
			System.out.println("Da dat gioi han don hang co the tao!");
			System.exit(1);
		}
	}
}
