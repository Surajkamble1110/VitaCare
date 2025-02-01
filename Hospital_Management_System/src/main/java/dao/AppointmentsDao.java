package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.AppointmentEntity;

public class AppointmentsDao {

	private Connection conn;

	public AppointmentsDao(Connection conn) {

		this.conn = conn;

	}

	public boolean collectData(AppointmentEntity appnt) {

		boolean res = false;

		try {

			String stmt = "INSERT INTO appointments (userName, userEmail, diseaseType, doctorName, exp) VALUES (?,?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(stmt);

			pstmt.setString(1, appnt.getUserName());
			pstmt.setString(2, appnt.getUserEmail());
			pstmt.setString(3, appnt.getDiseaseType());
			pstmt.setString(4, appnt.getDoctorName());
			pstmt.setInt(5, appnt.getExp());

			int count = pstmt.executeUpdate();

			if (count > 0) {

				res = true;

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return res;
	}

	public List<AppointmentEntity> getUserDetails(String n) {

		List<AppointmentEntity> l = new ArrayList<AppointmentEntity>();

		try {

			String stmt = "SELECT * FROM appointments WHERE doctorName = ?";

			PreparedStatement pstmt = conn.prepareStatement(stmt);
			
			pstmt.setString(1, n);

			ResultSet rst = pstmt.executeQuery();

			while (rst.next()) {

				String userName = rst.getString("userName");
				String userEmail = rst.getString("userEmail");
				String diseaseType = rst.getString("diseaseType");
				String doctorName = rst.getString("doctorName");
				int exp = rst.getInt("exp");

				l.add(new AppointmentEntity(userName, userEmail, diseaseType, doctorName, exp));
                 		
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return l;
	}
}
