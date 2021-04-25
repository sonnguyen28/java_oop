package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Object>{
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public abstract String printInfo();

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
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Media) {
			Media another = (Media) o;
			if(this.id == another.id) {
				return true;
			}
		}
		return false;
	}
	
	/*@Override
	public int compareTo(Object obj) {
		if(obj instanceof Media) {
			Media another = (Media) obj;
			return this.title.compareTo(another.title);
		}
		return 0;
	}*/
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Media) {
			Media another = (Media) obj;
			return (int) (this.cost - another.cost);
		}
		return 0;
	}
	
}

interface Playable{
	public void play();
}
