
import java.sql.*;

public class Requete {
	protected Connexion connexion;
	
	public void uneRequete() {		//nouvelle connexion

		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			ResultSet res = requete.executeQuery("SELECT "
					+ "no_etudiant, nom_etudiant from etudiant");
			laConnexion.close();
		} 
		
		catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		} 
	}
	
	public void InsertRequete(String p) {		//ajout d'une requete

		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			int res = requete.executeUpdate(""
					+ "INSERT INTO Periodicite(libelle)"
					+ "VALUES('" + p + "')");
			laConnexion.close();
		} 
		
		catch (SQLException sqle) {		
			System.out.println("Pb select" + sqle.getMessage());
		}
	}
	
	public void UpdateRequete(int id, String newlib) {	//modifier une requete

		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			int res = requete.executeUpdate(""
					+ "UPDATE Periodicite "
					+ "SET libelle = '" + newlib
					+ "' WHERE id_periodicite = '" + id + "'");
			laConnexion.close();
		} 
		
		catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		}
	}
	
	public void DeleteRequete(String lib) {		//suppression d'une requete

		try {
			connexion = new Connexion();
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			int res = requete.executeUpdate(""
					+ "DELETE FROM Periodicite(libelle) "
					+ "WHERE libelle= '" + lib + "' ");
			laConnexion.close();
		} 
		
		catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		}
	}
	
/*	
	ResultSet res = requete.executeQuery("select"
			+ " no_etudiant, nom_etudiant from etudiant");
	while (res.next()) {
		int no = res.getInt(1);
		String nom = res.getString("nom_etudiant");	
	}
	*/
}
