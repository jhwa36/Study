package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDao {
	private Connection conn;
	private ResultSet rs;
	
	public BbsDao() {
		try {
			String dbURL ="jdbc:mysql://localhost:3306/BBS?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "apfhd1";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDate() { //현재 시간 넣어주는 클래스
		String SQL = "SELECT NOW()";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					return rs.getString(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return ""; // 데이터베이스 오류
	}
	
	public int getNext() { //현재 시간 넣어주는 클래스
		String SQL = "SELECT bbsID FROM BBS ORDER BY bbsID DESC"; // 게시글 번호 1번부터 하나씩 늘어가므로 마지막에 쓰인 글을 가져와서 1을 더한 값이 다음 글의 번호
			try {				
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					return rs.getInt(1) + 1; // 나온값의 1을 더해 다음 게시글의 번호가 들어갈 수 있게 +1을 해준다.
				}
				return 1; // 현재가 첫번째 게시물인 경우 오류
			} catch (Exception e) {
				e.printStackTrace();
			}
		return -1; // 데이터베이스 오류
	}
	
	public int write(String bbsTitle, String userID, String bbsContent) {
		String SQL = "INSERT INTO BBS VALUES ( ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, bbsTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, getDate());
			pstmt.setString(5, bbsContent);
			pstmt.setInt(6, 1);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터베이스 오류
	}
	
	public ArrayList<Bbs> getList(int pageNumber){
		String SQL = "SELECT * FROM BBS WHERE bbsID < ? AND bbsAvailable = 1 ORDER BY bbsID DESC LIMIT 10";
		ArrayList<Bbs> list = new ArrayList<>();
		try {				
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,getNext() - (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setBbsUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				list.add(bbs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return list;
	}
	
	public boolean nextPage(int pageNumber) {	//페이징 처리하기 위한 함수
		String SQL = "SELECT * FROM BBS WHERE bbsID < ? AND bbsAvailable = 1 ORDER BY bbsID DESC LIMIT 10";
		try {				
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,getNext() - (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			if(rs.next()) {	// 결과가 하나라도 존재한다면 return true; 함으로써 다음페이지로 넘어간다.
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return false; // 그렇지 않다면 false
	}
	// 만약 게시글이 10개라면 페이지는 1밖에 없다. 11개가 되었을때 페이지가 2개가 되고 게시글이 20개가 되었을때 마찬가지로 페이지는 2개이다.
	// 페이지가 21개가 되었을때 그때 다시 페이지가 3으로 늘어난다. 특정한 페이지가 존재하는지 nextPage 함수르 이용하여 물어보는 것.
}
