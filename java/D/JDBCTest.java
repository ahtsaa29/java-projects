import java.sql.*;

public class JDBCTest {
	Connection con;
	Statement s;
	ResultSet rs;
	PreparedStatement ps;

	public JDBCTest() {
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// establish connection
			con = DriverManager.getConnection("jdbc:mysql://localhost/test_db?user=root&password=");
		} catch (Exception s) {
			System.out.println("exception in constructor");
			// finds out exception
			s.printStackTrace();
		}
	}

	public void insert(String full_name, String email, int roll, float gpa) {
		try {
			ps = con.prepareStatement("INSERT INTO tbl_student(full_name, email, roll, gpa) VALUES(?, ?, ?, ?)");
			ps.setString(1, full_name);
			ps.setString(2, email);
			ps.setInt(3, roll);
			ps.setFloat(4, gpa);
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("exception in insert");
		}
	}

	public void update(String full_name, String email, int roll, float gpa, int id) {
		try {
			ps = con.prepareStatement(
					"UPDATE tbl_student SET full_name = ?, email = ?, roll = ?, gpa = ? WHERE id = ?");
			ps.setString(1, full_name);
			ps.setString(2, email);
			ps.setInt(3, roll);
			ps.setFloat(4, gpa);
			ps.setInt(5, id);

			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("exception in insert");
		}
	}

	public void delete(int id) {
		try {
			ps = con.prepareStatement("DELETE FROM tbl_student WHERE id = ?");
			ps.setInt(1, id);

			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("exception in insert");
		}
	}

	public void selectAll() {
		try {
			// statement on connection
			s = con.createStatement();
			rs = s.executeQuery("SELECT * FROM tbl_student");
			while (rs.next()) {
				System.out.println("Full Name : " + rs.getString("full_name"));
				System.out.println("EMAIL : " + rs.getString("email"));
				System.out.println("Student ID : " + rs.getString("id"));
				System.out.println("GPA : " + rs.getString("gpa"));
				System.out.println("Roll : " + rs.getString("roll"));
				System.out.println("--------------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("exception in selectAll");
		}
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("exception in closeConnection");
		}

	}

	public static void main(String r[]) {
		JDBCTest g = new JDBCTest();
		// g.insert("ram", "ram@gmail.com", 45, 10.75f);
		// g.insert("hari", "hari@gmail.com", 145, 110.75f);
		// g.insert("sita", "sita@gmail.com", 245, 210.75f);

		// g.update("hari", "hari@gmail.com", 450, 100.75f, 1);
		// g.delete(1);
		g.selectAll();

		g.closeConnection();
	}
}