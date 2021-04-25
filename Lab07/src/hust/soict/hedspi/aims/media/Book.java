package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();	

	public void setCategory(String Category) {
		this.category = Category;
	}

	public void setCost(float Cost) {
		this.cost = Cost;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)){
			System.out.println("Tac gia da co trong DS !");
		}else {
			authors.add(authorName);
			System.out.println("Da them tac gia thanh cong !");
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Da xoa ten tac gia thanh cong !");
		}else {
			System.out.println("Tac gia khong co trong DS !");
		}
	}


	public Book(String title) {
		super(title);
	}

	public Book(String title, String category) {
		super(title, category);
	}
	
	@Override
	public String printInfo() {
		String strAthours = String.join(", ", authors);
		return "BOOK - " + getTitle() + " - " + getCategory() + " - " + strAthours + ": " + getCost() + "$\n"; 
	}


	public Book(String title, String category, List<String> authors) {
		super(title, category);
		// Loai bo tac gia bi trung trong DS truyen vao
		Set<String> set = new LinkedHashSet<String>(authors);
		this.authors = new ArrayList<String>(set);
	}

}
