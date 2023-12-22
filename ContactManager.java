package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactManager {

	public static void main(String[] args) {
		
	 
	//	String databaseURL = "jdbc:ucanaccess://Contacts.accdb";
		String databaseURL = "jdbc:ucanaccess://D:/java/java/Jdbs/Contacts.accdb";
		try {

			Connection connection = DriverManager.getConnection(databaseURL); 
		System.out.println("Connect to MS Access Database!");
	  String sql = "Insert into Contacts(Full_Name,Email,Phone) VALUES "
				+"('Sheraz Amjad','sheraz@gmail.com','12345678')";
				Statement statement =connection.createStatement();
				int row = statement.executeUpdate(sql);

	if(row>0)
	{
		System.out.println("A new contact has been Inserted!");
	}
			statement.close();
		
			connection.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}


}
}




/*
 *   this is simple database  connection
 * 
 *
	//	String databaseURL = "jdbc:ucanaccess://Contacts.accdb";
		String databaseURL = "jdbc:ucanaccess://D:/java/java/Jdbs/Contacts.accdb";
		try {
	
			Connection connection = DriverManager.getConnection(databaseURL); 
		System.out.println("Connect to MS Access Database!");
		
					connection.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		



/*	this is one method to enter data
 * 
 * 
 * 
 * //	String databaseURL = "jdbc:ucanaccess://Contacts.accdb";
	String databaseURL = "jdbc:ucanaccess://D:/java/java/Jdbs/Contacts.accdb";
	try {

		Connection connection = DriverManager.getConnection(databaseURL); 
	System.out.println("Connect to MS Access Database!");
 * String sql = "Insert into Contacts(Full_Name,Email,Phone) VALUES "
			+"('Sheraz Amjad','sheraz@gmail.com','12345678')";
			Statement statement =connection.createStatement();
			int row = statement.executeUpdate();

if(row>0)
{
	System.out.println("A new contact has been Inserted!");
}
		statement.close();
	
		connection.close();
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}

}
			*/
	
	
/*	this is 2nd method to enter database
 * 
 * 
 * 
//	String databaseURL = "jdbc:ucanaccess://Contacts.accdb";
	String databaseURL = "jdbc:ucanaccess://D:/java/java/Jdbs/Contacts.accdb";
	try {

		Connection connection = DriverManager.getConnection(databaseURL); 
	System.out.println("Connect to MS Access Database!");
 * 
 * String sql = "Insert into Contacts(Full_Name,Email,Phone) VALUES (?,?,?)";
	
	PreparedStatement statement = connection.prepareStatement(sql);
	statement.setString(1,"Awais");
	statement.setString(2,"awais@gmail.com");
	statement.setString(3,"987654321");
	
	
int row = statement.executeUpdate();

if(row>0)
{
	System.out.println("A new contact has been Inserted!");
}
		statement.close();
	
		connection.close();
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}

}
 * */

/*
 * this is 3rd method to enter data in database
 * 
 *
	//	String databaseURL = "jdbc:ucanaccess://Contacts.accdb";
		String databaseURL = "jdbc:ucanaccess://D:/java/java/Jdbs/Contacts.accdb";
		try {
	
			Connection connection = DriverManager.getConnection(databaseURL); 
		System.out.println("Connect to MS Access Database!");
		
	
		
		String sql = " SELECT * FROM Contacts";
		
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		while(result.next()) {
			int id = result.getInt("Contact_ID");
			String fullName= result.getString("Full_Name");
			String email= result.getString("Email");
			String phone= result.getString("Phone");
			
			System.out.println(id +" , "+ fullName + " , " + email + " , "+phone);
		}
		
			connection.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} 
 */


