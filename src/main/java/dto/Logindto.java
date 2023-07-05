package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Logindto {
	@Id
	private int id;
	private String Email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Logindto [id=" + id + ", Email=" + Email + ", password=" + password + "]";
	}
	
}
