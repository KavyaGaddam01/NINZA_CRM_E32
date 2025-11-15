package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException {

		// connect to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_e32", "root", "root");

		// create a statement
		Statement stat = conn.createStatement();

		// execute sql statement
		ResultSet set = stat.executeQuery("select campaignName from ninza_crm where targetSize=40");

		// create a variable to store your value
		String campaignName = null;

		while (set.next()) {
			campaignName = set.getString(1); // store value in variable
		}

		// now use the variable outside the loop
		System.out.println(campaignName);

		// disconnect from database
		conn.close();
	}

}
