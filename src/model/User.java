package model;
//import java.time.LocalDate;
import java.time.LocalDateTime;
//Type your code
public class User {
	String name;
	String email;
	LocalDateTime date2;
	String password;
	
	public User(String name,String password,LocalDateTime date2) {
		this.name=name;
		this.password = password;
		this.date2=date2;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDate(LocalDateTime date) {
		this.date2=date;
	}
	public void setPassword(String password2) {
		this.password = password2;
	}
	
	public char[] getEmail() {
		char email1[] = email.toCharArray();
		return email1;
		}
	public char[] getPassword() {
		char password1[] = password.toCharArray();
		return password1;
		}
//	public char[] getDate() {
////		char date1[] = date2;
//		LocalDateTime date1 = date2;
//		char date1[] = date2;
//		return date1;
//		}
	public char[] getDate() {
		// TODO Auto-generated method stub
		return null;
		}
	
}