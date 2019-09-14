
import java.sql.*;
public class Connexion {
	
	public Connection creeConnexion() {
		String url = 
		"jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/satori5u_binome";
		url += "?serverTimezone=Europe/Paris";
		String login = "satori5u_appli";
		String pwd = "31807690";
		Connection maConnexion = null;
		
		try {
				maConnexion = DriverManager.getConnection(url, login, pwd);
				
			} catch (SQLException sqle) {
				System.out.println("Erreur connexion" + sqle.getMessage());
			
		}
	
		return maConnexion;
	}
}


