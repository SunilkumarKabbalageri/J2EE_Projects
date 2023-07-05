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

@WebServlet("/bookshow")
public class Servleyt1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		String c_name = req.getParameter("c_name");
		String Moviename = req.getParameter("moviename");
		int ini_seatno = Integer.parseInt(req.getParameter("ini_seatno"));
		int end_seatno = Integer.parseInt(req.getParameter("end_seatno"));
		double ticket_price = Double.parseDouble(req.getParameter("ticket_price"));
		
		int count=0;
		for(int i=ini_seatno;i<end_seatno;i++){
			count++;
		}
		
		Bookticket bookticket = new Bookticket();
		bookticket.setC_name(c_name);
		bookticket.setMoviename(Moviename);
		bookticket.setTicket_price(ticket_price);
		bookticket.setTotal_t_price(ticket_price*count);
		bookticket.setNo_ticket(count);
        bookticket.setSeatno(ini_seatno+"-"+end_seatno);
        
        
		book_myshowdao book_myshowdao = new book_myshowdao();
		book_myshowdao.insert(bookticket);
		
		
		List<Bookticket> var = book_myshowdao.fetchAll();
	     req.setAttribute("data", var);
	     RequestDispatcher dispatcher= req.getRequestDispatcher("Fetchall.jsp");
	     dispatcher.forward(req, resp);	
		
	}

}
