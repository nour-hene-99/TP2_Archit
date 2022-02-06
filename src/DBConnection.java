import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
    //creation d'un attribut statique, sa valeur est une instance priv�e de la classe     
	    private static DBConnection instance;
    //QST 2 :
    // Creation d'un constructeur de visibilit� priv�e
	    private DBConnection() {}
	    
	//creation de la methode getinstance o� on va intancier cette derni�re
	    public static DBConnection getInstance() {
	    	if(instance==null) {
	    		instance=new DBConnection();
	    	}
	    	return instance;
	    }
	    
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
