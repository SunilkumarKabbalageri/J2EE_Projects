package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.book_myshowdao;
import dto.Bookticket;
@WebServlet("/bookshow1")
public class Fetch extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	 book_myshowdao book_myshowdao = new book_myshowdao();
		List<Bookticket> var = book_myshowdao.fetchAll();
     req.setAttribute("data", var);
     RequestDispatcher dispatcher= req.getRequestDispatcher("Fetchall.jsp");
     dispatcher.forward(req, resp);
     
}
}
