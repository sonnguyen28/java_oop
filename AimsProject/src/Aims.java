
public class Aims {

	public static void main(String[] args) {
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
		
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println("------------------------------------");
		System.out.println("Danh sach Ordered hien tai: ");
		anOrder.showdata();
		System.out.println("------------------------------------");
		System.out.println("Danh sach Ordered sau khi go dvd2(\"Star Wars\"): ");
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.showdata();
		System.out.println("------------------------------------");
		System.out.println("Them mot list 3 dvd");
		DigitalVideoDisc listTest[] = new DigitalVideoDisc[3];
		listTest[0] = new DigitalVideoDisc("dvd_test1");
		listTest[1] = new DigitalVideoDisc("dvd_test2");
		listTest[2] = new DigitalVideoDisc("dvd_test3");
		anOrder.addDigitalVideoDisc(listTest);
		System.out.println("Danh sach Ordered hien tai: ");
		System.out.println("------------------------------------");
		anOrder.showdata();
		System.out.println("Them vao 2 dvd");
		DigitalVideoDisc anime_test1 = new DigitalVideoDisc("kimi no namae wa");
		DigitalVideoDisc anime_test2 = new DigitalVideoDisc("kimetsu yaiba zenitsu");
		anOrder.addDigitalVideoDisc(anime_test1, anime_test2);
		System.out.println("Danh sach Ordered hien tai: ");
		anOrder.showdata();
	}

}
