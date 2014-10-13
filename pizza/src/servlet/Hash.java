package servlet;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	public String getHash(String pwd){
		try{
	MessageDigest md = MessageDigest.getInstance("SHA1");
	md.update(pwd.getBytes());
	BigInteger bint = new BigInteger(1, md.digest());
	pwd = bint.toString();
		}catch(NoSuchAlgorithmException e){
		e.printStackTrace();	
		}
		return pwd;
	}
}
