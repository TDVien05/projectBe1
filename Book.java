package projectBE1.java;

import java.util.Scanner;

public class Book implements IActivities {

	private String ISBN;
	private String tittle;
	private double price;
	private Author author;

	public Book() {

	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void addBook() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập mã số ISBN : ");
		String newISBN = scanner.nextLine();
		System.out.print("Nhập tiêu đề sách : ");
		String newTitle = scanner.nextLine();
		System.out.print("Nhập giá sách : ");
		int newPrice = scanner.nextInt();
		System.out.println("Nhập tác giả : ");
		String newAuthorID = scanner.nextLine();
		String newAuthorName = scanner.nextLine();

	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void storeBookDataToFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void storeAuthorDataToFile() {
		// TODO Auto-generated method stub

	}

}
