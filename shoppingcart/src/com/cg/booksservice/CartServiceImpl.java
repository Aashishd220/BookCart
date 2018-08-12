package com.cg.booksservice;

import java.util.Collection;
import java.util.List;

import com.cg.booksdao.CartDao;
import com.cg.booksdao.CartDaoImpl;
import com.cg.bookspojo.Books;

/**
 * @author aashish
 *
 */
public class CartServiceImpl implements CartService {

	CartDao dao = new CartDaoImpl();
	int count = 0;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksservice.CartService#viewAllBooks()
	 */
	@Override
	public Collection<Books> viewAllBooks() {
		return dao.viewAllBooks().values(); 
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksservice.CartService#addToCart(com.cg.bookspojo.Books)
	 */
	@Override
	public int addToCart(int id) {

		boolean check = true;
		count++;

		for (Books books : viewCart()) {
			if (books.getBookId() == id) {
				books.setBookcount(books.getBookcount() + 1);
				check = false;
				break;
			}

		}
		if (check) {
			dao.addToCart(dao.viewAllBooks().get(id));
		}
		return count;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksservice.CartService#viewCart()
	 */
	@Override
	public List<Books> viewCart() {
		return dao.viewCart();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.booksservice.CartService#removeFromCart(com.cg.bookspojo.Books)
	 */
	@Override
	public void removeFromCart(int id) {

		for (Books books : viewCart()) {
			if (books.getBookId() == id) {
				if (books.getBookcount() > 1)
					books.setBookcount(books.getBookcount() - 1);
				else {
					dao.removeFromCart(books);
				}

				break;
			}

		}

	}

}
