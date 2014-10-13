package servlet;
public class User {
private int id;
private String Etunimi;
private String Sukunimi;
private String username;
private String password;
private boolean valid;
public User(){
	id = 0;
	Etunimi ="";
	Sukunimi="";
	username="";
	password="";
	valid=false;
	
}
public User(int id, String etunimi, String sukunimi, String username,
		String password) {
	super();
	this.id = id;
	Etunimi = etunimi;
	Sukunimi = sukunimi;
	this.username = username;
	this.password = password;
	valid=true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEtunimi() {
	return Etunimi;
}
public void setEtunimi(String etunimi) {
	Etunimi = etunimi;
}
public String getSukunimi() {
	return Sukunimi;
}
public void setSukunimi(String sukunimi) {
	Sukunimi = sukunimi;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isValid(){
	return valid;
}
public void setValid(boolean newValid){
	valid = newValid;
}
}
