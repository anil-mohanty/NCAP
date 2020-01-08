/** All copyright reserved 2019.
 * 
 */
package testDebug;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;


/**
 * @author Anil Jul 27, 2019
 */
public class TaskBatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con;
		String query = "SELECT * FROM emp";
		//ArrayList<TaskBatchPojo> emplist = new ArrayList<TaskBatchPojo>();
		//Time stamp
		String s= new java.sql.Timestamp(System.currentTimeMillis()).toString();
		//remove the second part : and extra space
		s = s.substring(0, s.length()-6).replaceAll(":","");
		// create file
		File file = new File("E:\\Movies\\test" +s+".txt");
		FileWriter fstream = null;
		System.out.println(new java.sql.Timestamp(System.currentTimeMillis()));
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class loader");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {

				fstream = new FileWriter(file);
				BufferedWriter out = new BufferedWriter(fstream);
				out.write(rs.getString(1));
				out.write(rs.getString(2));
				out.write(rs.getString(3));
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
