
package com.cg.booksdao;

import java.util.List;
import java.util.Map;

import com.cg.bookspojo.Books;

/**
 * @author aashish
 *
 */
public interface CartDao {

	Map<Integer, Books> viewAllBooks();

	void addToCart(Books book);

	List<Books> viewCart();

	void removeFromCart(Books book);

}