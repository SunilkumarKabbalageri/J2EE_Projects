package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.book_myshowdao;
import dto.UserSignup;
@WebServlet("/signup")
public class Signup extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	int id=Integer.parseInt(req.getParameter("Id"));
	String ownername=req.getParameter("owner");
	String Email=req.getParameter("Email_id");
	String password=req.getParameter("password");
	long mob_no=Long.parseLong(req.getParameter("mob_no"));
	String country=req.getParameter("country");
	
	UserSignup signup=new UserSignup();
	signup.setOwnerid(id);
	signup.setOwnername(ownername);
	signup.setEmail(Email);
   signup.setPassword(password);
   signup.setMob_no(mob_no);
   signup.setCountry(country);
   
   book_myshowdao book_myshowdao=new book_myshowdao();
   book_myshowdao.insertdata(signup);
   
//   String myEml=book_myshowdao.fetchEmail(id,Email);
//	  String Mypwd= book_myshowdao.fetchPassword(id,password);
//	  System.out.println(myEml);
//	  System.out.println(Mypwd);
   
	  
   String myEml=book_myshowdao.fetchEmail(id,Email);
   String Mypwd= book_myshowdao.fetchPassword(id,password);
   req.setAttribute("email", myEml);
   req.setAttribute("password", Mypwd);
   RequestDispatcher dispatcher=req.getRequestDispatcher("Login.java");
   dispatcher.forward(req, resp);
	
}
}
