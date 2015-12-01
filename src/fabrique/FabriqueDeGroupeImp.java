package fabrique;

import app.TypeGroupe;

public class FabriqueDeGroupeImp implements FabriqueDeGroupe {

	
	private static final FabriqueDeGroupeImp instance = new FabriqueDeGroupeImp();
	
	public FabriqueDeGroupeImp() {
		super();
		// TODO Auto-generated constructor stub
	}


    public Object creerGroupe(String name, TypeGroupe type) {
    	Object groupe = null;
        switch (type) {
            case FabriqueFiliere:
            	FabriqueFiliere fabriqueFiliere = FabriqueFiliere.getInstance();
            	groupe = fabriqueFiliere.creerGroupe(name);
                break;
            case FabriqueLaboratoire:
            	FabriqueLaboratoire fabriqueLaboratoire = FabriqueLaboratoire.getInstance();
            	groupe = fabriqueLaboratoire.creerGroupe(name);
                break;
			default:
				System.out.println("La filière n'existe pas");
				break;
        }
        return groupe;
    }

    public static FabriqueDeGroupeImp getInstance() {
        return instance;
    }



}
