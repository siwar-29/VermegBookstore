package bookstore;

import java.sql.*;


public class MyConnection {
	
	
	Connection con =null;
	 Statement stmt =null;
	 ResultSet rs=null;
	 
	 
	 
	 public MyConnection() {
		  try {
			 Class.forName("com.mysql.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/bookstore","root","" );
			 System.out.println("done");
			
		 }catch(ClassNotFoundException e) {
			 e.printStackTrace();
			 
		 }
		 catch (SQLException e) {
			 e.printStackTrace();
			 
		 }
	 }
	 

	
	public  void dateUse() {
		 try {
		 stmt=con.createStatement();
		 String req="INSERT INTO book(title, Author, Price, ReleaseDate) VALUES ('neyra','siwar',13,'2010-2-10')";
		 int x= stmt.executeUpdate(req);
		}
		 catch (SQLException e) {
			 e.printStackTrace();
			 
		 }
		 
		 }
	 
	 
	 public void displayBook() 
	    {   
		    
	    try {
	    	stmt =  con.createStatement(); 
	    	 String req1="select *from book "; 
	    ResultSet rs = stmt.executeQuery(req1);
	    int i=0;
	    while (rs.next()) {
	        i++;
	        System.out.println("------------------------------------------");

	        System.out.println("Book n° "+i);
	        System.out.println("id : " + rs.getInt("id"));
	        System.out.println("title : " + rs.getString("title"));
	        System.out.println("Author : " + rs.getString("author"));
	        System.out.println("price : " + rs.getDouble("price"));
	        System.out.println("date: " + rs.getDate("releaseDate"));
	    }}
	    catch(SQLException e)
	    {e.printStackTrace();}}
		
		
		 
	
	 


}
