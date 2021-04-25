

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cinderellaDVD.getTitle());
		
		//chanTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("Sau khi hoan doi !!!!! ");
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cinderellaDVD.getTitle());
	}
	
	// Method swap da chinh sua
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String titleDvd1 = dvd1.getTitle();
		String titleDvd2 = dvd2.getTitle();
		dvd1.setTitle(titleDvd2);
		dvd2.setTitle(titleDvd1);
	}
	
	public static void chanTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
