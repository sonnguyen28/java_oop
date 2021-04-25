package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks= new ArrayList<Track>();
	
	
	
	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}



	public CompactDisc(String title) {
		super(title);
	}
	

	public CompactDisc(String title, String artist) {
		super(title);
		this.artist = artist;
	}


	public CompactDisc(String title, String artist, ArrayList<Track> tracks) {
		super(title);
		this.artist = artist;
		this.tracks = tracks;
	}


	public CompactDisc(String title, int length, String director) {
		super(title, length, director);
	}


	public CompactDisc(String title, int length) {
		super(title, length);
	}


	public CompactDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
	}


	public CompactDisc(String title, String category, int length, String director) {
		super(title, category, length, director);
	}
	

	public void addTrack(Track titleTrack) {
		if(this.tracks.contains(titleTrack) == true) {
			System.out.println("Track da ton tai !!!");
		}else {
			this.tracks.add(titleTrack);
			System.out.println("Da them thanh cong !");
		}
	}
	
	public void removeTrack(Track titleTrack) {
		if(this.tracks.contains(titleTrack) == true) {
			tracks.remove(titleTrack);
			System.out.println("Da xoa thanh cong !");
		}else {
			System.out.println("Track khong ton tai trong danh sach !!!");
		}
	}
	
	public int getLength() {
		int total = 0;
		for (Track track : tracks) {
			total += track.getLength();
		}
		return total;
	}

	@Override
	public void play() {
		for (Track track : tracks) {
			track.play();
		}	
	}
	
	@Override
	public String printInfo() {
		return "CompactDisc - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + getLength() + ": " + getCost() + "$\n";
	}
}
