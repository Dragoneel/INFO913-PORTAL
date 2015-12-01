package app;
public class Main {

	public static void dipsplayMenu(){
		 // Display menu graphics
		System.out.println("======================================");
		System.out.println("|   	Université de savoie         |");
	    System.out.println("======================================");
	    System.out.println("| Options:                           |");
	    System.out.println("|        1. Lister les groupe        |");
	    System.out.println("|        2. Accéder à un groupe      |");
	    System.out.println("|        3. Créer un groupe          |");
	    System.out.println("|        4. Ajouter à un groupe      |");
	    System.out.println("|        5. Initialisation           |");
	    System.out.println("|        6. Exit                     |");
	    System.out.println("======================================");
	}

	public static void main(String[] args) {
		// Initialise le portail
		Portal portal = new Portal();
		
	    // Local variable
	    int swValue = 0;

	    while(swValue!=6){
		   	dipsplayMenu();
		    swValue = Keyin.inInt(" Select an option: ");

		    // Switch construct
		    switch (swValue) {
			    case 1:
			      System.out.println("=> Lister les groupe");
			      System.out.println(portal.listerGroupe());
			      System.out.println("Done.\n\n");
			      break;
			    case 2:
			      System.out.println("=> Accéder à un groupe");
			      System.out.println(portal.listerContenuGroupe(0));
			      System.out.println("Done.\n\n");
			      break;
			    case 3:
			      System.out.println("=> Créer un groupe");
			      portal.creerGroupe("SAVOIE", TypeGroupe.FabriqueLaboratoire);
			      System.out.println("Done.\n\n");
			      break;
			    case 4:
				  System.out.println("=> Ajouter à un groupe");
				  portal.ajouterContenuGroupe("newDocument");
				  System.out.println("Done.\n\n");
				  break;
			    case 5:
				  System.out.println("=> Initialisation");
				  portal.creerGroupe("M1", TypeGroupe.FabriqueFiliere);
				  portal.creerGroupe("M2", TypeGroupe.FabriqueFiliere);
				  System.out.println("Done.\n\n");
				  break;
			    case 6:
				  System.out.println("========> Exit");
				  System.out.println("Done.\n\n");
				  break;
			    default:
			      System.out.println("Invalid selection");
			      System.out.println("\n\n");
		    }
	    }

	}

}
