package bbs;

public class Bbs {
	// 자바 Beans 하나의 게시글 정보를 담을 수 있는 인스턴스를 만들기 위한 틀. 데이터베이스 테이블과 흡사한 구조. 전반적인 게시글 하나를 관리.
	private int bbsID;
	private String bbsTitle;
	private String userID;
	private String bbsDate;
	private String bbsContent;
	private int bbsAvailable;

	public Bbs() {
		
	}
	
	public void setBbsID(int bbsID) {
		this.bbsID=bbsID;
	}
	public int getBbsID() {
		return bbsID;
	}
	
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle=bbsTitle;
	}
	public String getBbsTitle() {
		return bbsTitle;
	}
	
	public void setBbsUserID(String userID) {
		this.userID=userID;
	}
	public String getUserID() {
		return userID;
	}
	
	public void setBbsDate(String bbsDate) {
		this.bbsDate=bbsDate;
	}
	public String getBbsDate() {
		return bbsDate;
	}
	
	public void setBbsContent(String bbsContent) {
		this.bbsContent=bbsContent;
	}
	public String getBbsContent() {
		return bbsContent;
	}
	
	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable=bbsAvailable;
	}
	public int getBbsAvailable() {
		return bbsAvailable;
	}
}
