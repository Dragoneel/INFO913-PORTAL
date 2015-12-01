package fabrique;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

import groupe.Laboratoire;

@objid ("ac781178-093b-46ce-827a-cf96680065c7")
public class FabriqueLaboratoire {
	
	
	private FabriqueLaboratoire() {
		super();
	}

	private static final FabriqueLaboratoire instance = new FabriqueLaboratoire();

	@objid ("0e458ccd-665f-4ae7-9fe3-55c2df7f79e0")
    public Object creerGroupe(String name) {
		return new Laboratoire(name);
	}
    
    public static FabriqueLaboratoire getInstance() {
        return instance;
    }
}
