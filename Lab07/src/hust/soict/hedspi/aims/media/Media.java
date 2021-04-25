package hust.soict.hedspi.aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public abstract String printInfo();

	
	
	public int getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getCategory() {
		return category;
	}


	public float getCost() {
		return cost;
	}
	

	public Media(String title) {
		this.title = title;
	}


	public Media(String title, String category) {
		this(title);
		this.category = category;
	}


	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	
}

interface Playable{
	public void play();
}
