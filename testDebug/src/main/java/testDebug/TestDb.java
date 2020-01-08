/** All copyright reserved 2019.
 * 
 */
package testDebug;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Anil Jul 24, 2019
 */
public class TestDb {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class loader");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM emp");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
