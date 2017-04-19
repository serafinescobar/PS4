package pkgLibrary;

public class BookException extends Exception {

	private String id;
	private Book b;
	
	public BookException(String id) {
		this.id = id;
	}
	
	public BookException(Book b) {
		this.b = b;
	}
	
	public String getId() {
		return id;
	}
	
	public Book getBook() {
		return b; 
	}
}
