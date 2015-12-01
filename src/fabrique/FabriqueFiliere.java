package fabrique;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

import groupe.Filiere;

@objid ("b09ea9b5-ec83-4b3a-a3d9-56531c2a9e26")
public class FabriqueFiliere {
	
	
	private FabriqueFiliere() {
		super();
	}

	private static final FabriqueFiliere instance = new FabriqueFiliere();

	@objid ("0e458ccd-665f-4ae7-9fe3-55c2df7f79e0")
    public Object creerGroupe(String name) {
		return new Filiere(name);
	}
    
    public static FabriqueFiliere getInstance() {
        return instance;
    }
}
