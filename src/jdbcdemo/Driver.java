package jdbcdemo;


import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//1. get a connection to database
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false",  "root", "nabil");
			
			//2. create a statement
			
			Statement myStmt = myConn.createStatement();
			
			//3. execute SQL query
			
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			//4.process the result set
			
			while (myRs.next()) {
				
				System.out.println(myRs.getString("last name") + ", " + myRs.getString("first name"));
			}
				
			
			
			
		} catch (Exception exc){
		exc.printStackTrace();
		
		
		}
		
	}

	
}
