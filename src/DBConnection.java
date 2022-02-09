import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
		//QST 2 : 
		//creation of a static attribute , his value is a private instance of this class
	    private static Connection conn;
       
	  
    //QST 2 :
    // Creation d'un constructor of private visibility 
	    private DBConnection() {}
	
	    
	    
	    public  void DBConnection1() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	  //QST 2 :   
		//creation of method getConn where we will instantiate this instance
	    public static Connection getConn() {
	    	
			return conn;
		}


		
	
}
