//pojo class
package com.cg.bookspojo;

/**
 * @author aashish
 *
 */
public class Books {

	private String bookName;
	private String authorName;
	private String bookDesc;
	private String link;
	private int bookPrice;
	private int bookId;
	private int bookcount;

	public Books() {

	}

	/**
	 * @param bookName
	 * @param authorName
	 * @param bookDesc
	 * @param link
	 * @param bookPrice
	 * @param bookId
	 * @param bookcount
	 */
	public Books(String bookName, String authorName, String bookDesc, String link, int bookPrice, int bookId,
			int bookcount) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookDesc = bookDesc;
		this.link = link;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
		this.bookcount = bookcount;
	}
	//getters and setters
	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public int getBookcount() {
		return bookcount;
	}

	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", authorName=" + authorName + ", bookDesc=" + bookDesc + ", link="
				+ link + ", bookPrice=" + bookPrice + ", bookId=" + bookId + ", bookcount=" + bookcount + "]";
	}

}
