package hust.soict.hedspi.aims.media;

public class Track implements Playable, Comparable<Object>{
	
	private String title;
	private int length;
	
	
	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public Track(String title) {
		super();
		this.title = title;
	}


	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle()); 
		System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Track) {
			Track another = (Track) o;
			if(this.title.equals(another.title)&&
				this.length == another.length) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Track) {
			Track another = (Track) obj;
			return this.title.compareTo(another.title);
		}
		return 0;
	}
	
}
