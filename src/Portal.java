import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5708b8a-ac1a-483f-b4ec-04120eacc8e4")
public class Portal {
    @objid ("3a754910-712d-494d-b664-5a90bd9dbd23")
    public List<Groupe> groupe = new ArrayList<Groupe> ();

    @objid ("12c680b0-b14d-4efa-863c-b163b7137356")
    public List<Membre> membre = new ArrayList<Membre> ();

    @objid ("aea837bc-c082-490b-839f-13a047cb81e0")
    public Portal(String name) {
    }

    @objid ("c3425ff8-018e-4087-966a-ab1b8140d31e")
    public void listerGroupe() {
    }

    @objid ("868209e5-f330-48a3-9227-617ad537c379")
    public void miseAJour() {
    }

}
