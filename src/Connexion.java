import java.sql.*;
public class Connexion {
	public Connection creeConnexion() {
		
		String url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/eck6u_tdjava";
		url += "?serverTimezone=Europe/Paris";
		String login = "eck6u_appli";
		String pwd = "31810690"; 
		Connection maConnexion = null;	
		
		
		try 
		{ maConnexion = DriverManager.getConnection(url, login, pwd);
		
		} 
		catch (SQLException sqle) 
		{System.out.println("Erreur connexion" + sqle.getMessage());
		}
		return maConnexion;
	}
	

}