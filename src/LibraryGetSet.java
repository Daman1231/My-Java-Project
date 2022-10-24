
public class LibraryGetSet {
	private String librarian;
	public String booksIssue;

	public LibraryGetSet(String libraryPerson, String issuedBook) {
		this.librarian = libraryPerson;
		this.booksIssue = issuedBook;

	}

	public void updateBooks(String updateBook, String libraryPerson) {
		if (updateBook.equalsIgnoreCase(booksIssue)) {
			booksIssue = updateBook;

		}

	}

	void getBooks() {
		System.out.println("Updated Book by daman is  " + booksIssue);

	}

}
