package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.book_myshowdao;
import dto.Logindto;
import dto.UserSignup;

@WebServlet("/login1")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		int id = Integer.parseInt(req.getParameter("id"));
		String Email = req.getParameter("Email_id");
		String password = req.getParameter("password");

		UserSignup x = (UserSignup) req.getAttribute("email");
		UserSignup y = (UserSignup) req.getAttribute("password");

		if (Email.equals(x) && password.equals(y)) {
			resp.sendRedirect("Bookmyshow.html");
		} else {
			resp.sendRedirect("Login.jsp");
		}

	}
}
