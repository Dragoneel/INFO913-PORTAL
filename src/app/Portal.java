package app;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fabrique.FabriqueDeGroupeImp;
import groupe.Filiere;
import groupe.Laboratoire;

@objid ("b5708b8a-ac1a-483f-b4ec-04120eacc8e4")
public class Portal {
	
	public Portal() {
		super();
	}

	public static void initSystem(){
	       JSONParser parser = new JSONParser();
	       
	       Object obj = null;
			try {
				obj = parser.parse(new FileReader("/Users/Dchar Ahmed/workspace-java/INFO913-COO-PORTAL/system.json"));
			} catch (IOException | ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       JSONObject jsonObject = (JSONObject) obj;
	       
	       JSONArray groupe = (JSONArray) jsonObject.get("groupe");
	       
	       for (Object item : groupe) {
	    	  System.out.println(item);
	       }
	}

	@objid ("3a754910-712d-494d-b664-5a90bd9dbd23")
    public List<Object> groupe = new ArrayList<Object> ();
	
	public Object currentGroupe = null;

    @objid ("12c680b0-b14d-4efa-863c-b163b7137356")
    public List<Membre> membre = new ArrayList<Membre> ();

    @objid ("aea837bc-c082-490b-839f-13a047cb81e0")
    public Object creerGroupe(String name, TypeGroupe type) {
    	Object groupeCreated = null;
    	FabriqueDeGroupeImp fabriqueDeGroupe = new FabriqueDeGroupeImp(); 
    	Object instance = fabriqueDeGroupe.creerGroupe(name, type);
    	String typeGroupe = instance.getClass().getSimpleName();
    	switch (typeGroupe) {
	        case "Filiere":
	        	Filiere filiere = (Filiere) instance;
	        	
	        	// Ajout de membre
	        	Membre m = new Membre("Ahmed");
	        	Membre m2 = new Membre("Nassif");
	        	filiere.ajouterMembre(m);
	        	filiere.ajouterMembre(m2);
	        	
	        	// Ajout d'un dossier
	        	filiere.creerContenu("INFO913");
	        	filiere.creerContenu("INFO921");
	        	
	        	// Ajout d'un document dans un dossier
	        	filiere.getContenu().get(0).ajouterContenu("cours01");
	        	filiere.getContenu().get(1).ajouterContenu("cours02");
	        	
	        	// Ajout de la filiere avec sans contenu
	        	groupe.add(filiere);
	        	
	        	groupeCreated = filiere;
	        	break;
	        case "Laboratoire":
	        	Laboratoire laboratoire = (Laboratoire) instance;
	        	
	        	// Ajout de membre
	        	Membre mLaboratoire = new Membre("Ahmed");
	        	laboratoire.ajouterMembre(mLaboratoire);
//	        	mLaboratoire.ajouterGroupeAuMembre(laboratoire);
	        	
	        	// Ajout d'un dossier
	        	laboratoire.creerContenu("Research");
	        	
	        	// Ajout de la filiere avec sans contenu
	        	groupe.add(laboratoire);
	        	
	        	groupeCreated = laboratoire;
	        	break;
			default:
				System.out.println("La filière n'existe pas");
				break;
	    }
    	return groupeCreated;
    }
    
    public Object listerContenuGroupe(int indice) {
    	Filiere f = (Filiere) groupe.get(indice);
    	currentGroupe = f;
		return f.listerContenu();
    }
    
    public void ajouterContenuGroupe(String name) {
    	if (currentGroupe != null) {
    		System.out.println("adding");
	    	String typeGroupe = currentGroupe.getClass().getSimpleName();
	    	switch (typeGroupe) {
		        case "Filiere":
		        	Filiere filiere = (Filiere) currentGroupe;
		        	filiere.creerContenu(name);
		        	
		        	break;
		        case "Laboratoire":
		        	Laboratoire laboratoire = (Laboratoire) currentGroupe;
		        	laboratoire.creerContenu(name);
		        	
		        	break;
				default:
					System.out.println("La filière n'existe pas");
					break;
	    	}
    	}
    	else{
    		System.out.println("Accédez à un dossier");
    	}
    }

    @objid ("c3425ff8-018e-4087-966a-ab1b8140d31e")
    public List<Object> listerGroupe() {
		return groupe;
    }

    @objid ("868209e5-f330-48a3-9227-617ad537c379")
    public void miseAJour() {
    }

    @objid ("85527768-50b6-41d9-b7f6-ec7c1770bef9")
    public void clonerGroupe() {
    }

}
