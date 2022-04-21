package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud_db 
{

	public static void main(String[] args) 
	{
		String dbURL="jdbc:mysql://127.0.0.1:3306/Sample";
		String dbUserName="root";
		String dbPassword="Printf^81Skanf$61";
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "delete from Employee where user_id=?";
			PreparedStatement p = c.prepareStatement(sql);
			p.setString(1,"105");
			int rows=p.executeUpdate();
			if(rows>0)
			{
				System.out.println("A user was deleted successfully");
			}
			c.close();
			
			/*try
			{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "select* from Employee";
			Statement st = c.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name = rs.getString(2);
				String pass = rs.getString(3);
				String email = rs.getString("email");
				String res="User :%d - %s - %s - %s";
				System.out.println(String.format(res, id, name, pass, email));
			}
			c.close();
			/*PreparedStatement p = c.prepareStatement(sql);
			p.setString(1,"105");
			p.setString(2,"Chandana");
			p.setString(3,"sepass");
			p.setString(4,"ch@gmail.com");
			
			int rowsInserted = p.executeUpdate();
			if(rowsInserted>0)
			{
				System.out.println("Rows inserted successfully");
			}
			c.close(); */	
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
