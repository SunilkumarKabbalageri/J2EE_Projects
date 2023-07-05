package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserSignup {
@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
private int ownerid;
private String ownername;
private String Email;
private String password;
private long mob_no;
private String country;
@Override
public String toString() {
	return "UserSignup [ownerid=" + ownerid + ", ownername=" + ownername + ", Email=" + Email + ", password=" + password
			+ ", mob_no=" + mob_no + ", country=" + country + "]";
}
public int getOwnerid() {
	return ownerid;
}
public void setOwnerid(int ownerid) {
	this.ownerid = ownerid;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
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
public long getMob_no() {
	return mob_no;
}
public void setMob_no(long mob_no) {
	this.mob_no = mob_no;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
