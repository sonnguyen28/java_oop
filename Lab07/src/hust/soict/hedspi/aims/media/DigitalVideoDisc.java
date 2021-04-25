package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
		
	public DigitalVideoDisc(String title, int length, String director) {
		super(title, length, director);
	}

	public DigitalVideoDisc(String title, int length) {
		super(title, length);
	}

	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
	}

	public DigitalVideoDisc(String title, String category, int length, String director) {
		super(title, category, length, director);
	}

	public DigitalVideoDisc(String title) {
		super(title);
	}

	@Override
	public String printInfo() {
		return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$\n";
	}
	
	public boolean search(String dataIn) {
		String []strDataIn = dataIn.split(" ");
		String []strTitle = this.title.split(" ");
		for (int i = 0; i < strDataIn.length; i++) {
			int check = 0; // Bien kiem tra su ton tai cua 1 tu trong Title
			for (int j = 0; j < strTitle.length; j++) {
				if(strDataIn[i].equalsIgnoreCase(strTitle[j]) == true) {
					check = 1;
					break;
				}
			}
			if(check == 0) return false;
		}
		return true;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle()); 
		System.out.println("DVD length: " + this.getLength());
		
	}
	
	
}
