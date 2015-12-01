package contenu;
import java.util.ArrayList;
import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d57295d0-2329-4020-a0e0-96c98b925de8")
public class Contenu {
    @objid ("50b9feee-9bf7-4c30-94e1-5feb8a2bcd8f")
    public List<RelationDocument> relationDocument = new ArrayList<RelationDocument> ();
    
    public List<Contenu> contenu = new ArrayList<Contenu>();
    
    public Contenu(String name) {
		super();
		this.name = name;
	}

	public String name;
   

	@objid ("3da0802f-11b7-46c0-8d1a-c399cbd27bbe")
    public Object creerContenu(String name) {
    	return new Repertoire(name);
    }

    @objid ("7883da1e-31ae-4f90-8589-cd66b48b892e")
    public void miseAJourContenu() {
    }

    @objid ("7076b8ed-99e2-4343-9299-b2fa03c0f24c")
    public void ajouterContenu(String name) {
    	System.out.println("Contenu : fired");
    }

    @objid ("d1b0714f-901e-4fcf-b75e-b1ef7487f0f0")
    public void listerContenu() {
    }

    @objid ("1c76bb8c-fb48-4907-8cc2-ce9fd4b959ba")
    public void listerRelation() {
    }

    @objid ("36c1eaa9-43fb-4220-8931-7efd4ab7436e")
    public void ajouterRelation(String src, String dest, String type){
    	
    }

    @objid ("e87c1921-f3a6-4ef2-bff1-12ed17263871")
    public void miseAJourRelation() {
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contenu> getContenu() {
		return contenu;
	}

	public void setContenu(List<Contenu> contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "\n\t\tContenu [\n\t\tcontenu=" + contenu.size() + ", name=" + name + "\n\t\t]";
	}
	
	
	
	

	

}
