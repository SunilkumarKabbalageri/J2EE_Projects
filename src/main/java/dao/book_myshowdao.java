package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import org.apache.catalina.User;

import com.mysql.cj.Query;

import dto.Bookticket;
import dto.Logindto;
import dto.UserSignup;
import sun.security.krb5.internal.crypto.EType;

public class book_myshowdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
	public boolean insert(Bookticket bookticket) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(bookticket);
		entityTransaction.commit();
		return true;
		
	}
	
	public List<Bookticket> fetchAll() {
		// TODO Auto-generated method stub
		javax.persistence.Query e =entityManager.createQuery("select a from Bookticket a");
		List<Bookticket> l1=e.getResultList();
//		for(Bookticket b1:l1){
////			System.out.println(b1);
//			return b1;
//		}
		return l1;
	}

	public void Edit(int booking_id, String c_name, String moviename) {
		// TODO Auto-generated method stub
		Bookticket bookticket=entityManager.find(Bookticket.class, booking_id);
		bookticket.setC_name(c_name);
		bookticket.setMoviename(moviename);
		
		entityTransaction.begin();
		entityManager.merge(bookticket);
		entityTransaction.commit();
	}

	public void Delete(int booking_id) {
		// TODO Auto-generated method stub
		Bookticket x=entityManager.find(Bookticket.class, booking_id);
		entityTransaction.begin();
		entityManager.remove(x);
		entityTransaction.commit();
	}

	public void insertdata(UserSignup signup) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(signup);
		entityTransaction.commit();
	}

	public  String fetchEmail(int id, String email) {
		// TODO Auto-generated method stub
		UserSignup u=entityManager.find(UserSignup.class, id);
      return email;
	}

	public String fetchPassword(int id, String password) {
		// TODO Auto-generated method stub
		UserSignup u=entityManager.find(UserSignup.class, id);
		return password;
	}

	public void insertdata1(Logindto logindto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(logindto);
		entityTransaction.commit();
	}

	public String fetchEmailLogin(int id, String email) {
		// TODO Auto-generated method stub
		Logindto u=entityManager.find(Logindto.class, id);
		
	      return email;
	}

	public String fetchPasswordLogin(int id, String password) {
		// TODO Auto-generated method stub
		Logindto u=entityManager.find(Logindto.class, id);
	
		return password;
	}

	



	
	

}
