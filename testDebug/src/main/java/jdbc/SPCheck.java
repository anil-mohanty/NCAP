/** All copyright reserved 2019.
 * 
 */
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anil Jul 31, 2019
 */
public class SPCheck {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","admin");
		String sql ="{CALL GET_TRANSACTION(?,?,?)}";
		CallableStatement cs = conn.prepareCall(sql);
		
		cs.getString(1);
		cs.getString(2);
		cs.getString(3);
		
	}

}
