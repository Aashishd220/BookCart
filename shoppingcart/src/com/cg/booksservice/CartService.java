//service interface
package com.cg.booksservice;

import java.util.Collection;
import java.util.List;

import com.cg.bookspojo.Books;

public interface CartService {

	Collection<Books> viewAllBooks();

	int addToCart(int id);

	List<Books> viewCart();

	void removeFromCart(int id);

}