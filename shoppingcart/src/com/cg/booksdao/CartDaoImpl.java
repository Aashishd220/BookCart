package com.cg.booksdao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.bookspojo.Books;

/**
 * @author aashish
 *
 */
public class CartDaoImpl implements CartDao {

	static List<Books> bookList = new ArrayList<>(); // bookList to store elements in cart
	static Map<Integer, Books> bookMap = new HashMap<>();// bookMap to store elements in database

	// initializing the constructor
	Books book1 = new Books(" The Odyssey", "Homer", "Action", "odyssess.jpg", 432, 101, 1);
	Books book2 = new Books(" The Great Gatsby", "F. Scott Fitzgerald", "Mystery", "thegreat.jpg", 232, 102, 1);
	Books book3 = new Books("Hamlet", "William Shakespeare", "Mystery", "hamlet.jpg", 343, 103, 1);
	Books book4 = new Books("In Search of Lost Time", "Marcel Proust", "Dramatic", "insearch.jpg", 313, 104, 1);

	// putting the books in map
	{
		bookMap.put(book1.getBookId(), book1);
		bookMap.put(book2.getBookId(), book2);
		bookMap.put(book3.getBookId(), book3);
		bookMap.put(book4.getBookId(), book4);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksdao.CartDao#viewAllBooks()
	 */
	// storing values to map
	@Override
	public Map<Integer, Books> viewAllBooks() {
		return bookMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksdao.CartDao#addToCart(com.cg.bookspojo.Books)
	 */

	// adding books to cart
	@Override
	public void addToCart(Books book) {
		bookList.add(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksdao.CartDao#viewCart()
	 */

	// view cart
	@Override
	public List<Books> viewCart() {
		return bookList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksdao.CartDao#removeFromCart(com.cg.bookspojo.Books)
	 */

	// remove from cart
	@Override
	public void removeFromCart(Books book) {
		bookList.remove(book);
	}

}
