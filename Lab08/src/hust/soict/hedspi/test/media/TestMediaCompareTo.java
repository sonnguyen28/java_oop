package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;


import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;

public class TestMediaCompareTo{

	public static void main(String[] args) {
	Collection<DigitalVideoDisc> collection = new ArrayList<DigitalVideoDisc>();
	Collection<CompactDisc> collection1 = new ArrayList<CompactDisc>();
	
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", 19f, 87);
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star Wars", 24f, 124);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 18f, 90);
	dvd2.play();
	dvd1.play();
	dvd3.play();
	
	System.out.println("--------------------------------------");
	Track track1 = new Track("track1", 1);
	Track track2 = new Track ("track2", 2);
	Track track3 = new Track("track3", 3);
	Track track4 = new Track ("track4", 4);
	Track track6 = new Track ("track6", 6);
	
	CompactDisc cd1 = new CompactDisc("IBM Symphoney");
	cd1.setCost(25f);
	cd1.addTrack(track3); cd1.addTrack(track4); cd1.addTrack(track6);
	System.out.println("The total length of the CD1 to add is: " + cd1.getLength());
	cd1.play();
	
	System.out.println("--------------------------------------");
	CompactDisc cd2 = new CompactDisc("Ca nhac thieu nhi");
	cd2.setCost(10.5f);
	cd2.addTrack(track1); cd2.addTrack(track2);
	System.out.println("The total length of the CD2 to add is: " + cd2.getLength());
	cd2.play();
	System.out.println("--------------------------------------");
	CompactDisc cd3 = new CompactDisc("Lich su Viet Nam");
	cd3.setCost(19.5f);
	cd3.addTrack(track1);cd3.addTrack(track2);cd3.addTrack(track3);
	System.out.println("The total length of the CD3 to add is: " + cd2.getLength());
	cd3.play();
	
	collection1.add(cd1); collection1.add(cd2); collection1.add(cd3);
	
	System.out.println("--------------------------------------");
	DigitalVideoDisc dvd4 = new DigitalVideoDisc("Warmup", 19.95f, 87);
	DigitalVideoDisc dvd5 = new DigitalVideoDisc("Scales", 24.95f, 124);
	DigitalVideoDisc dvd6 = new DigitalVideoDisc("Introduction", 18.99f, 90);
	dvd4.play();
	dvd5.play();
	dvd6.play();
	System.out.println("Total Cost is: " + (dvd1.getCost()+dvd2.getCost()+dvd3.getCost()+ cd1.getCost() +dvd4.getCost()+dvd5.getCost()+dvd6.getCost()));
	// Add the DVD objects to the ArrayList
	collection.add(dvd1);
	collection.add(dvd2);
	collection.add(dvd3);
	
	// Iterate through the ArrayList and output their titles
	// (unsorted order)
	java.util.Iterator<DigitalVideoDisc> iterator = collection.iterator();
	
	System.out.println("-------------------------------------------");
	System.out.println("The DVDs currently in the order are: ");
	
	while (iterator.hasNext()) {
		System.out.println
		(iterator.next().getTitle());
	}
	
	//Sort the collection of DVDs - based on the compareTo()
	//method
	java.util.Collections.sort((java.util.List<DigitalVideoDisc>)collection);
	
	
	// Iterate through the ArrayList and output their titles -
	// in sorted order
	iterator = collection.iterator();
	
	System.out.println("------------------------------------------");
	System.out.println("The DVDs currently in the order are: ");
	
	while (iterator.hasNext()) {
		System.out.println
		(iterator.next().getTitle());
	}
	System.out.println("------------------------------------------");
	
	java.util.Iterator<CompactDisc> iterator1 = collection1.iterator();
	
	System.out.println("-------------------------------------------");
	System.out.println("The CDs currently in the order are: ");
	
	while (iterator1.hasNext()) {
		System.out.println
		(iterator1.next().getTitle());
	}
	
	//Sort the collection of DVDs - based on the compareTo()
	//method
	java.util.Collections.sort((java.util.List<CompactDisc>)collection1);
	
	
	// Iterate through the ArrayList and output their titles -
	// in sorted order
	iterator1 = collection1.iterator();
	
	System.out.println("------------------------------------------");
	System.out.println("The CDs currently in the order are: ");
	
	while (iterator1.hasNext()) {
		System.out.println
		(iterator1.next().getTitle());
	}
	System.out.println("------------------------------------------");
	}
	
	
}
