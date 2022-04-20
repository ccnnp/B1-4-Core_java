package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Db_connectivity 
{

	public static void main(String[] args) 
	{
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capgeminii";
		String dbUserName="root";
		String dbPassword="Printf^81Skanf$61";
		String query="select *from EnggStudent";
		try 
		 {
			 Class.forName(dbDriver);
		 }
		 catch(ClassNotFoundException e)
		 {
			 e.printStackTrace();
			 
		 }
		try
		 {
			 Connection con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(query);
			 
			 while(rs.next())
			 {
				 String Stud_data="";
				 for(int i=1;i<=2;i++)// i belongs to column of SQL table  here
				 {
					 Stud_data=Stud_data+" "+rs.getString(i);
					 
				 }
				 System.out.println(Stud_data);
			 }
		 }
			 catch(SQLException e)
			 {
				 System.out.println("An error occurred. Maybe user/password is invalid");
				 e.printStackTrace();
				 
			 }
		 }
	}

