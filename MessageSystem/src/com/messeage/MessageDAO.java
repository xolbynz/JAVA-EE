package com.messeage;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.DTO.MemberDTO;

public class MessageDAO {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
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


	public void insert(MessageDTO dto) {
		// TODO Auto-generated method stub
		int cnt = 0;
		getConn();
		try {
			System.out.println("sql문 전 ");
			String sql = "insert into web_message values(m_num.nextval,?,?,?,sysda"
					+ "te)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getSend_name());
			pst.setString(2, dto.getReceive_email());
			pst.setString(3, dto.getContent());
			
			System.out.println("sql문 끝 ");
			cnt = 0;
			cnt = pst.executeUpdate();
			// 4. JDBC이 사용이 끝났음으면 역순으로 닫아준ㄴ다

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
	public ArrayList<MessageDTO> select(String getReceive_email) {
		// TODO Auto-generated method stub
		ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
		System.out.println(getReceive_email);
		MessageDTO my= null;
		getConn();
		System.out.println("selct sql전");
		String sql = "select * from web_message where receive_email = ? order by day desc";
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, getReceive_email);
			

			rs = pst.executeQuery();

			while(rs.next()) {
				System.out.println("넣어줌");
				int num = rs.getInt(1);
				String send_name = rs.getString(2);
				String receive_email = rs.getString(3);
				String content = rs.getString(4);
				String day = rs.getString(5);
				my = new MessageDTO(num,send_name,receive_email,content,day);
				list.add(my);
				System.out.println("넣음"+num+send_name+receive_email+content+day);
				System.out.println(list.get(0));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("sql에러");
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
		
	private MessageDTO MessageDTO(int num, String send_name, String receive_email, String content, String day) {
		// TODO Auto-generated method stub
		return null;
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


	public void deletAll(String email) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		getConn();
		try {
			System.out.println("sql문 전 ");
			String sql = "delete from web_message where receive_email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			
			
			System.out.println("sql문 끝 ");
			cnt = 0;
			cnt = pst.executeUpdate();
			// 4. JDBC이 사용이 끝났음으면 역순으로 닫아준ㄴ다

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}
	}
	public void delete(int c_num) {
		// TODO Auto-generated method stub
		
		
		getConn();
		try {
			System.out.println("sql문 전 ");
			String sql = "delete from web_message where num=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c_num);
			
			
			System.out.println("sql문 끝 ");
			
			pst.executeUpdate();
			// 4. JDBC이 사용이 끝났음으면 역순으로 닫아준ㄴ다

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
