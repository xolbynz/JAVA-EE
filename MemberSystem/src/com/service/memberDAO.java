package com.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class memberDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private static memberDAO dao;
	
	
	private memberDAO() {
		
	}
	public static memberDAO getDAO(){
		
		if(dao==null) {
			dao=new memberDAO();
		}
		return dao;
	}

	private void getConn() {
		try {
			InputStream in = this.getClass().getResourceAsStream("db.properties");
			
			Properties p = new Properties();
			p.load(in);
			
			System.out.println(p.getProperty("driver"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("id"));
			System.out.println(p.getProperty("pw"));
			Class.forName(p.getProperty("driver"));
			// 2.DriverManager를 통해 Java와 Oracle DB를 연결하는 Connection 객체를 가져온다.
			String url = p.getProperty("url");
			String user = p.getProperty("id");
			String password = p.getProperty("pw");
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {

				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String login(MemberDTO m) {
		String name = null;
		getConn();
		try {

			String sql = "select name from member where id=? and pw=?";
			pst = conn.prepareStatement(sql);

			pst.setString(1, m.getId());
			pst.setString(2, m.getPw());

			rs = pst.executeQuery();
			name = null;
			if (rs.next()) {
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}

		return name;
	}

	public int join(MemberDTO m) {

		int cnt = 0;
		getConn();
		try {
			
			String sql = "insert into member values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, m.getId());
			pst.setString(2, m.getPw());
			pst.setString(3, m.getName());

			cnt = 0;
			cnt = pst.executeUpdate();
			// 4. JDBC이 사용이 끝났음으면 역순으로 닫아준ㄴ다

		}  catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		close();
		}
		return cnt;
	}
}
