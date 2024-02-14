package practice;

public class Book {
	private String bookName; //제목
	private String genre; //장르	
	private String author; //저자
	private int bookNumber; //번호

	
	public Book(String bookName, String genre, String author, int bookNumber) {
		super();
		this.bookName = bookName;
		this.genre = genre;
		this.author = author;
		this.bookNumber = bookNumber;
	}
	
	@Override
	public String toString() {
		return "[bookName=" + bookName + ", genre=" + genre + ", author=" + author + ", bookNumber=" + bookNumber
				+ "]";
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return this.bookName;
	}
	public int getBookNumber() {
		return this.bookNumber;
	}
	
	
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber=bookNumber;
	}
	
}
