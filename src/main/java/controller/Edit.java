package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.book_myshowdao;
@WebServlet("/Edit")
public class Edit extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	int booking_id=Integer.parseInt(req.getParameter("booking_id"));
	String c_name=req.getParameter("c_name");
	String Moviename=req.getParameter("moviename");
	
	book_myshowdao book_myshowdao=new book_myshowdao();
	book_myshowdao.Edit(booking_id,c_name,Moviename);
	
	
}
}
