package projectBE1.java;

public class Author extends BookStore {

	private String authorID;
	private String name;

	public Author() {

	}

	public String getAuthorID() {
		return authorID;
	}

	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
