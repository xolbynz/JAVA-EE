package com.Member;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class BookDAO {
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rst;
	private static BookDAO dao;
	
	private BookDAO(){
		
	}
	
	public static BookDAO getDAO() {
		if(dao==null) {
			dao = new BookDAO();
		}
		return dao;
	}
	
	private void getConn() {
		
		try {
			InputStream in = this.getClass().getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in);
			Class.forName(p.getProperty("driver"));
			
			String url = p.getProperty("url");
			String user = p.getProperty("id");
			String password = p.getProperty("pw");
			conn = DriverManager.getConnection(url, user, password);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void close() {
		try {
			if (rst != null)
				rst.close();
			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int insert_member(BookDTO m) {
		int cnt = 0;
		getConn();
		String sql = "INSERT INTO book_member VALUES(?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, m.getId());
			pst.setString(2, m.getPw());
			pst.setString(3, m.getNick());
			pst.setString(4, m.getEmail());
			pst.setString(5, m.getTel());
			
			cnt = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	 public String login_member(BookDTO m) {

         String my = null;
         getConn();
         System.out.println("sql전");
         String sql = "select nick from book_member where id = ? and pw = ?";
         try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, m.getId());
            pst.setString(2, m.getPw());

            rst = pst.executeQuery();

            if (rst.next()) {
               System.out.println("넣어줌");
       
               my = rst.getString(1);

            }
         } catch (SQLException e) {
            System.out.println("sql에러");
            e.printStackTrace();
         } finally {
            close();
         }

         return my;
      }
	
	
}
