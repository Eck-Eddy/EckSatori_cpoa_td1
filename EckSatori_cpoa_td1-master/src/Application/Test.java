package Application;
import java.util.Scanner;

import Tables.Abonnement;
import Tables.Client;
import Tables.Period;
import Tables.Revue;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Application en ligne de commande");
		System.out.println("Saisir la table à modifier :\n");
		System.out.println("1-Periodicite\n2-Revue\n3-Client\n4-Abonnement");
		
		int table=sc.nextInt();
		
		System.out.println("1-Insert/2-Update/3-Delete");
		
		int operation=sc.nextInt();
		
		if (table == 1) {
			Period requete = new Period();
			
			if(operation ==1) {
				String ch = sc.next();
				System.out.println("Saisir le nom de la période à ajouter : ");
				requete.ajoutPeriod(ch);
			}
			if (operation ==2) {
				System.out.println("Saisir l'indice , puis  la valeur à remplacer");
				int indice = sc.nextInt();
				String ch = sc.next();
				requete.modifPeriod(indice, ch);
			}
			if (operation==3) {
				System.out.println("Saisir la valeur à supprimer");
				String ch = sc.next();
				requete.supprPeriod(ch);
			}
			
		}
		if (table==2) {
			Revue requete = new Revue();
			if(operation ==1) {
				System.out.println("Saisir le titre, la description, le tarif, le visuel et l'id_periodicite : ");

				String t = sc.next();
				String d = sc.next();
				double tn = sc.nextDouble();
				String v = sc.next();
				int id = sc.nextInt();
				requete.ajoutRevue(t,d,tn,v,id);
			}
			if (operation ==2) {
				System.out.println("Saisir l'indice , puis : titre, description, tarif, visuel, id_periodicite");
				int indice = sc.nextInt();
				String t = sc.next();
				String d = sc.next();
				double tn = sc.nextDouble();
				String v = sc.next();
				int id = sc.nextInt();
				requete.modifRevue(indice,t,d,tn,v,id);
			}
			if (operation==3) {
				System.out.println("Saisir l'indice de la ligne à supprimer");
				int id = sc.nextInt();
				requete.supprRevue(id);
			}
			
		}
		if (table == 3) {
			Client requete = new Client();
			if(operation ==1) {
				
				System.out.println("Saisir l'id, nom, prénom, n°rue, voie,code postal,ville et pays du client : ");
				int id = sc.nextInt();
				String nom = sc.next();
				String prenom = sc.next();
				String nrue = sc.next();
				String voie = sc.next();
				String cp = sc.next();
				String ville = sc.next();
				String pays = sc.next();
				requete.ajoutClient(id,nom, prenom, nrue, voie, cp, ville, pays);
			}
			if (operation ==2) {
				System.out.println("Saisir l'indice du client à modifier, puis son nom, prénom, n°rue, voie, cp, ville, pays");
				int indice = sc.nextInt();
				String nom = sc.next();
				String prenom = sc.next();
				String nrue = sc.next();
				String voie = sc.next();
				String cp = sc.next();
				String ville = sc.next();
				String pays = sc.next();
				requete.modifClient(indice,nom, prenom, nrue, voie, cp, ville, pays);
			}
			if (operation==3) {
				System.out.println("Saisir l'indice pour supprimer les valeurs associées");
				int id = sc.nextInt();
				requete.supprClient(id);
			}
			
		}
		if (table == 4) {
			Abonnement requete = new Abonnement();
			if(operation ==1) {
				System.out.println("Saisir l'id_client,l'id_revue, date début et fin (aaaa-mm-jj) : ");

				int idc = sc.nextInt();
				int idr = sc.nextInt();
				String dd = sc.next();
				String df = sc.next();
				requete.ajoutAbonnement(idc,idr,dd,df);
			}
			if (operation ==2) {
				System.out.println("Saisir les indices du client et de la revue , puis  les dates à remplacer");
				int idc = sc.nextInt();
				int idr = sc.nextInt();
				String dd = sc.next();
				String df = sc.next();
				requete.modifAbonnement(idc,idr, dd,df);
			}
			if (operation==3) {
				System.out.println("Saisir les indices du client et de la revue, pour supprimer la ligne associée");
				int idc = sc.nextInt();
				int idr = sc.nextInt();
				requete.supprAbonnement(idc,idr);
			}
			
		}
		
	}

}
