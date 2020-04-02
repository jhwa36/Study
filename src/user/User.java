package user;

public class User {
	// 데이터베이스 및 자바 Beans  하나의 데이터를 관리하고 처리하는 기법을 JSP에서 구현하는 것을 자바Beans라고 한다.
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	
	public void setUserID(String userID) {
		this.userID=userID;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword=userPassword;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUserGender(String userGender) {
		this.userGender=userGender;
	}
	public String getUserGender() {
		return userGender;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}
	public String getUserEmail() {
		return userEmail;
	}

	
	
	
}
