package com.cg.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.booksservice.CartService;
import com.cg.booksservice.CartServiceImpl;

/**
 * Servlet implementation class CartController
 */
@WebServlet("*.app")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CartService service = new CartServiceImpl();

		// creating session
		HttpSession session = request.getSession();

		// getting servelet path
		String action = request.getServletPath();

		switch (action) {
		// displaying all the books
		case "/home.app":
			session.setAttribute("books", service.viewAllBooks());
			System.out.println(service.viewAllBooks());
			session.setAttribute("cart", service.viewCart());
			response.sendRedirect("home.jsp");
			break;

		// getting the count in cart
		case "/add.app":
			int id = Integer.parseInt(request.getParameter("bookId"));
			service.addToCart(id);
			response.sendRedirect("home.jsp");
			break;

		// showing the books in cart
		case "/view.app":

			session.setAttribute("cart", service.viewCart());
			response.sendRedirect("cart.jsp");
			break;

		// removing books from cart
		case "/remove.app":

			int id1 = Integer.parseInt(request.getParameter("bookId"));
			service.removeFromCart(id1);
			session.setAttribute("cart", service.viewCart());
			response.sendRedirect("cart.jsp");
			break;

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
