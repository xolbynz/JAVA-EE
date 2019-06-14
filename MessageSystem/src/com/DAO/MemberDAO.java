package com.DAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.DTO.MemberDTO;

public class MemberDAO {
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

	public int join(MemberDTO m) {

		int cnt = 0;
		getConn();
		try {

			String sql = "insert into web_member values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, m.getEmail());
			pst.setString(2, m.getPw());
			pst.setString(3, m.getTel());
			pst.setString(4, m.getAddr());

			cnt = 0;
			cnt = pst.executeUpdate();
			// 4. JDBC이 사용이 끝났음으면 역순으로 닫아준ㄴ다

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
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

	public MemberDTO login(MemberDTO m) {
		// TODO Auto-generated method stub

		MemberDTO my = null;
		getConn();
		System.out.println("sql전");
		String sql = "select email, tel, addr from web_member where email = ? and pw = ?";
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, m.getEmail());
			pst.setString(2, m.getPw());

			rs = pst.executeQuery();

			if (rs.next()) {
				System.out.println("넣어줌");
				String email = rs.getString(1);
				String tel = rs.getString(2);
				String addr = rs.getString(3);

				my = new MemberDTO(email, tel, addr);

			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("sql에러");
			e.printStackTrace();
		} finally {
			close();
		}

		return my;
	}

	public int update(MemberDTO dto) {
		// TODO Auto-generated method stub
		getConn();
		int cnt = 0;
		String sql = "update web_member set pw=?,tel=?,addr=? where email=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getPw());
			pst.setString(2, dto.getTel());
			pst.setString(3, dto.getAddr());
			pst.setString(4, dto.getEmail());

			cnt = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

}
