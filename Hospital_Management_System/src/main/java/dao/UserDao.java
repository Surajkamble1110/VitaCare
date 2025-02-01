package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import entity.User;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {

		this.conn = conn;

	}

	public boolean register(User user) {

		boolean res = false;

		try {

			String stmt = "INSERT INTO user_detail (name, email, password) VALUES (?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(stmt);

			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());

			int count = pstmt.executeUpdate();

			if (count > 0) {

				res = true;

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return res;
	}

	public boolean isUser(String name, String password) {

		boolean res = false;

		try {

			String stmt = "SELECT name, password FROM user_detail WHERE name=? AND password=?";

			PreparedStatement pstmt = conn.prepareStatement(stmt);
			
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			
			ResultSet resultSet = pstmt.executeQuery();
			
			
			if (resultSet.next()) {
				
				res = true;
				
				}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return res;
	}
}
