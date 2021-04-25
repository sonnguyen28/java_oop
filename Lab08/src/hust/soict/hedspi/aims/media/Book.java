package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Book extends Media {
	private String content;
	private List<String> authors = new ArrayList<String>();	
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String,Integer> wordFrequency = new TreeMap<String, Integer>();
	
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "BOOK - " + getTitle() + " - " + getCategory() + " - " + strAthours + ": " + getCost() + "$" + "\n" + toString() + "\n"; 
	}


	public Book(String title, String category, List<String> authors) {
		super(title, category);
		// Loai bo tac gia bi trung trong DS truyen vao
		Set<String> set = new LinkedHashSet<String>(authors);
		this.authors = new ArrayList<String>(set);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Book) {
			Book another = (Book) obj;
			return this.title.compareTo(another.title);
		}
		return 0;
	}

	public void processContent() {
		String[] words = this.content.split(" ");
		for (String word : words) {
			this.contentTokens.add(word);
		}
		for (String word : this.contentTokens) {
			if(this.wordFrequency.containsKey(word)) {
				int valueKey = this.wordFrequency.get(word);
				this.wordFrequency.replace(word, valueKey+1);
			}else {
				this.wordFrequency.put(word, 1);
			}
		}
	}
	@Override
	public String toString() {
		return "Total tokens: " + this.contentTokens.size() + "\n"+ this.wordFrequency;
	}
	
}
