package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	
	private String director;
	private int length;
	

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	@Override
	public String toString() {
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
	
	
}
