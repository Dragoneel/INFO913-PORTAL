package groupe;

import java.util.ArrayList;
import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import app.Membre;
import contenu.Contenu;
import contenu.Document;
import contenu.Repertoire;

@objid ("fd30e4c4-1fcf-43ef-bb09-3172aeaebec6")
public class Groupe {
    @objid ("002c0c07-ccf2-481e-8f61-3518ef998a6b")
    protected String nom;
    
    

    public Groupe(String nom) {
		super();
		this.nom = nom;
	}

	@objid ("5c068e06-599b-4266-9a5b-075b9a7b039e")
    public List<Contenu> contenu = new ArrayList<Contenu> ();
	
	@objid ("5c068e06-599b-4266-9a5b-075b9a7b039e")
    public List<Membre> membre = new ArrayList<Membre> ();

    @objid ("e78b945a-4e10-45ba-a853-ffa1814fdd92")
    public Object listerContenu() {
    	return contenu;
    }

    @objid ("55c55b0f-ee4b-4e59-91dc-5bf5a4b8c0b0")
    public void creerContenu(String name) {
    	Repertoire contenu_elt = new Repertoire(name);
    	contenu.add(contenu_elt);
    }

    @objid ("b2ab3016-c48d-4c41-bbb6-39cbd4896e37")
    public void ajouterMembre(Membre m) {
    	membre.add(m);
    }

    @objid ("baa2af8f-e007-4e10-9fec-f5b69dc1906d")
    public void ajouterContenu(String name) {
    	Document document = new Document(name);
    	contenu.add(document);
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Membre> getMembre() {
		return membre;
	}

	public void setMembre(List<Membre> membre) {
		this.membre = membre;
	}

	public List<Contenu> getContenu() {
		return contenu;
	}

	public void setContenu(List<Contenu> contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "\nGroupe [nom=" + nom + ",\n contenu=" + contenu + ", membre=" + membre + "\n]";
	}
	
	
	
    

}
