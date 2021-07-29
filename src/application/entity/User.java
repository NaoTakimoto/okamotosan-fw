package application.entity;

import jisaku_jpa.annotation.Entity;
import jisaku_jpa.annotation.Table;
import jisaku_jpa.annotation.column;
import jisaku_jpa.annotation.id;

@Entity
@Table("user")
public class User {
	
	@id
	@column
	private int userID;

	@column
	private String userPassword;

	
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
