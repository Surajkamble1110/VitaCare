package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.UserSpecificEntity;

public class UserSpecificDao {

		private Connection conn;

		public UserSpecificDao(Connection conn) {

			this.conn = conn;

		}

		public boolean collectData(UserSpecificEntity spfcData) {

			boolean res = false;

			try {

				String stmt = "INSERT INTO userSpecific (userName, diseaseType, doctorName,  appointmentDate, phoneNum) VALUES (?,?,?,?,?)";

				PreparedStatement pstmt = conn.prepareStatement(stmt);

				pstmt.setString(1, spfcData.getUserName());
				pstmt.setString(2, spfcData.getDiseaseType());
				pstmt.setString(3, spfcData.getDoctorName());
				pstmt.setString(4, spfcData.getDate());
				pstmt.setString(5, spfcData.getPhoneNum());

				int count = pstmt.executeUpdate();

				if (count > 0) {

					res = true;

				}

			} catch (Exception e) {

				e.printStackTrace();

			}

			return res;
		}
	
		
		
		public List<UserSpecificEntity> getUserSpecificDetails(String n) {

			List<UserSpecificEntity> l = new ArrayList<UserSpecificEntity>();

			try {

				String stmt = "SELECT * FROM userspecific WHERE userName = ?";

				PreparedStatement pstmt = conn.prepareStatement(stmt);
				
				pstmt.setString(1, n);

				ResultSet rst = pstmt.executeQuery();

				while (rst.next()) {

					String userName = rst.getString("userName");
					String diseaseType = rst.getString("diseaseType");
					String doctorName = rst.getString("doctorName");
					String date = rst.getString("appointmentDate");
					String phoneNum = rst.getString("phoneNum");

					l.add(new UserSpecificEntity(userName,diseaseType, doctorName, date, phoneNum));
	                 		
				}

			} catch (Exception e) {

				e.printStackTrace();

			}

			return l;
		}
}
