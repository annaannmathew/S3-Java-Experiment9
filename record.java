import java.sql.*;    
public class record    
{    
    public static void main(String args[]) throws Exception 
    {          
  	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");        
  	Connection con = DriverManager.getConnection("jdbc:odbc:dsn1", "system", "pintu");          
  	System.out.println("Connected to database");    
  	Statement stmt = con.createStatement();         
  	ResultSet rs = stmt.executeQuery("select * from employee");         
  	while (rs.next())    
  	{         
   	    int x = rs.getInt("empno");         
   	    String y = rs.getString("empname");         
   	    int z = rs.getInt("sal");    
   	    System.out.println(x + "   " + y + " " + z);    
  	}    
  	con.close();    
    }    
}     