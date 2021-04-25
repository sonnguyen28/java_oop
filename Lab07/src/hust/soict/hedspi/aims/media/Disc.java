package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	

	public void setLength(int length) {
		this.length = length;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	public Disc(String title) {
		super(title);
	}

	public Disc(String title, int length) {
		super(title);
		this.length = length;
	}


	public Disc(String title, int length, String director) {
		super(title);
		this.length = length;
		this.director = director;
	}


	public Disc(String title, String category, int length, String director) {
		super(title, category);
		this.length = length;
		this.director = director;
	}

	
	public Disc(String title, String category, float cost, int length, String director) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}


	@Override
	public String printInfo() {
		return null;
	}


	

	
}
