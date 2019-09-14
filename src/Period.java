import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Period {
	protected Connexion connexion;
	
	public Period() {
		this.connexion = connexion;
	}

	public void ajoutPeriod(String p) { //done
		
		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			int res = requete.executeUpdate(""
					+ "INSERT INTO Periodicite(libelle)"
					+ "VALUES('"+p+"')");
			laConnexion.close();
			 
		}
		catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		}
	}
	
	public void modifPeriod(int id,String newlib) {
		
		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			int res = requete.executeUpdate(""
					+ "UPDATE Periodicite"
					+ "SET libelle = '" +newlib+ "' "
					+ "WHERE id_periodicite ="+id);
			laConnexion.close();

			 
		}
		catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		}
	}
	public void supprPeriod(String lib) {
		
		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			int res = requete.executeUpdate("DELETE FROM Periodicite (libelle) WHERE libelle = '"+lib+"'");
			laConnexion.close();

			 
		}
		catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		}
	}
}
