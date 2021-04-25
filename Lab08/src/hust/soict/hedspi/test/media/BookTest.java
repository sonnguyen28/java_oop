package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("Book1", "Lang mang");
		book1.setCost(100f);
		book1.setId(1);
		String strAuthors = "Tac gia 1, Tac gia 2";
		//Them cac tac gia cua sach vao trong List authors cua Book
		String[] listAuthors = strAuthors.split(", ");
		for (String author : listAuthors) {
			book1.addAuthor(author);
		}
		book1.setContent("Hom nay la thu hai thoi tiet hom nay that la dep");
		book1.processContent();
		System.out.print(book1.printInfo());
	}

}
