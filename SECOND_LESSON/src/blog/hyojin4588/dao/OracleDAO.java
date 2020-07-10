package blog.hyojin4588.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	
	private static OracleDAO dao = null;
	
	private OracleDAO() {}
	
	public static OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	// 싱글톤 타입은 보통 메소드 이름을 getInstance로 맞춘다.
	
	public Connection getCon() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Connection con = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);

		System.out.println("접속 성공!");
		return con;
	}
	
	public void closeConn(Connection i) throws Exception {
		if(i != null) {
			try {
				i.close();
			} catch(Exception e) {
				
			}
		}
	}

}
