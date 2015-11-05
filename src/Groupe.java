import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fd30e4c4-1fcf-43ef-bb09-3172aeaebec6")
public class Groupe {
    @objid ("002c0c07-ccf2-481e-8f61-3518ef998a6b")
    public String nom;

    @objid ("5c068e06-599b-4266-9a5b-075b9a7b039e")
    public List<Contenu> contenu = new ArrayList<Contenu> ();

    @objid ("e78b945a-4e10-45ba-a853-ffa1814fdd92")
    public void listerContenu() {
    }

    @objid ("55c55b0f-ee4b-4e59-91dc-5bf5a4b8c0b0")
    public void creerContenu(String name) {
    }

}
