package contenu;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("005bfcfb-c5d2-49d9-90a3-4bf576ae64ce")
public class Document extends Contenu {
	
	@objid ("cb64796f-60b9-4156-8342-6769000b5606")
    public RelationDocument relationDocument;

	public Document(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n\t\tDocument [\n\t\tname=" + this.name + "\n\t\t]";
	}
	
	

}
