package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Bookticket {
@Id
private int booking_id;
private String c_name;
private String seatno;
private double ticket_price;
private double total_t_price;
private String moviename;
private int no_ticket;
public int getBooking_id() {
	return booking_id;
}
public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public String getSeatno() {
	return seatno;
}
public void setSeatno(String seatno) {
	this.seatno = seatno;
}
public double getTicket_price() {
	return ticket_price;
}
public void setTicket_price(double ticket_price) {
	this.ticket_price = ticket_price;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public int getNo_ticket() {
	return no_ticket;
}
public void setNo_ticket(int no_ticket) {
	this.no_ticket = no_ticket;
}
public double getTotal_t_price() {
	return total_t_price;
}
public void setTotal_t_price(double total_t_price) {
	this.total_t_price = total_t_price;
}
@Override
public String toString() {
	return "Bookticket [booking_id=" + booking_id + ", c_name=" + c_name + ", seatno=" + seatno + ", ticket_price="
			+ ticket_price + ", total_t_price=" + total_t_price + ", moviename=" + moviename + ", no_ticket="
			+ no_ticket + "]";
}



}
