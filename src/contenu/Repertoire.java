package contenu;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("558dd634-4a29-498a-ba14-38c3b84feb0f")
public class Repertoire extends Contenu {
   
	
	public Repertoire(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@objid ("593b63b8-5f19-4a3f-ade4-062301c5faa4")
    public List<Contenu> contenu = new ArrayList<Contenu>();

	public List<Contenu> getContenu(){
		return contenu;
	}

	public void setContenu(List<Contenu> contenu) {
		this.contenu = contenu;
	}
	
	public void ajouterContenu(String name) {
		Document document = new Document(name);
		contenu.add(document);
	}

	@Override
	public String toString() {
		List<Contenu> contenuDisplay = contenu;
		if (contenuDisplay.isEmpty()) {
			return "\n\t\tRepertoire [\n\t\tcontenu= vide, name="+this.name+"\n\t\t]";
		} else {
			return "\n\t\tRepertoire [\n\t\tcontenu=" + contenu.get(0).getName() + ", name="+this.name+"\n\t\t]";
		}
		
	}
	
	
	

}
