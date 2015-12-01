package app;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

import groupe.Groupe;

@objid ("ea189692-7eab-44b0-b204-9f0170fc8bb5")
public class Membre {
    @objid ("6341557f-771b-4a50-8070-276f40e85a23")
    public List<Groupe> listeDeGroupe = new ArrayList<Groupe> ();
    
    
    
    public Membre(String nom) {
		super();
		this.nom = nom;
	}

	public String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public void ajouterGroupeAuMembre(Groupe g) {
		listeDeGroupe.add(g);
	}

	@Override
	public String toString() {
		return "\n\t\tMembre [\n\t\tlisteDeGroupe=" + listeDeGroupe + ", nom=" + nom + "\n\t\t]";
	}
    
    

}
