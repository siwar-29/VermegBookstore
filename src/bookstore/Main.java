package bookstore;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;


public class Main {
	
	private static Scanner scanner;
	
	
	//Affecter la methode main
		public static void main(String[] args) {
			
			System.out.println( "** WECLOME TO OUR BOOKSTORE ** \n");
			MyConnection con= new MyConnection();
           con.insertBook();
          con.displayBook();
			
		
        	 
			//try-catch block
			try {
			
			//pour pouvoir entrer les variables à partitr de l'utilisateur 
				scanner=new Scanner(System.in);
			
			//entrer le premier variable: qte
			System.out.println("Saisir la quantité désiré SVP: ");
			
			//lire le variable qte
			int qte=scanner.nextInt();
			
			//entrer le premier variable: prix
			System.out.println("Saisir le prix SVP:");
			
			//lire le variable de prix
			float unitPrice=scanner.nextFloat();
			
			//instanciation du classe Produit
			Produit p=new Produit();
			
			//l'affichage du résultat
			System.out.println("Le prix totale de l'achat est: \n\n"+p.calculateTotalePrice(qte, unitPrice)+ " Dinars");
			}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}

		}
}