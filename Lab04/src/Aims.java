
public class Aims {

	public static void main(String[] args) {
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
		

		System.out.println("Tao Order2 va nhap vao 1 list 3 dvd bang \"addDigitalVideoDisc(DigitalVideoDisc [] dvdList)\" ");
		Order anOrder2 = new Order();
		
		DigitalVideoDisc listTest[] = new DigitalVideoDisc[3];
		listTest[0] = new DigitalVideoDisc("Kimi no namae wa");
		listTest[0].setCategory("Anmation");
		listTest[0].setCost(20.95f);
		listTest[0].setDirector("Roger Allers");
		listTest[0].setLength(87);
		
		listTest[1] = new DigitalVideoDisc("Kimetsu yaiba zenitsu");
		listTest[1].setCategory("Anmation");
		listTest[1].setCost(25f);
		listTest[1].setDirector("Georger Lucas");
		listTest[1].setLength(124);
		
		listTest[2] = new DigitalVideoDisc("Doraemon");
		listTest[2].setCategory("Anmation");
		listTest[2].setCost(20.95f);
		listTest[2].setDirector("Roger Allers");
		listTest[2].setLength(87);
		anOrder2.addDigitalVideoDisc(listTest);
		anOrder2.printOrder();
		System.out.println("Nhap them 2 dvd nua vao Order2 bang \"addDigitalVideoDisc(dvd1,dvd2)\" !");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Tom and Jerry");
		dvd5.setCategory("Anmation");
		dvd5.setCost(30f);
		dvd5.setDirector("Roger Allers");
		dvd5.setLength(87);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Doraemon");
		dvd6.setCategory("Anmation");
		dvd6.setCost(50f);
		dvd6.setDirector("Georger Lucas");
		dvd6.setLength(124);
		anOrder2.addDigitalVideoDisc(dvd5, dvd6);
		anOrder2.printOrder();
		
		// Khi tao qua 2 Order chuong trinh se thong bao loi "Da dat gioi han don hang co the tao" va dung chuong trinh
		System.out.println("Thu tao them Order3 va nhap vao 1 dvd!");
		Order anOrder3 = new Order();
		
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("The Lion King");
		dvd13.setCategory("Anmation");
		dvd13.setCost(19.95f);
		dvd13.setDirector("Roger Allers");
		dvd13.setLength(87);
		anOrder3.addDigitalVideoDisc(dvd13);
		anOrder3.printOrder();
		
	}

}
