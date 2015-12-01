package app;

public enum TypeGroupe {

    FabriqueFiliere, FabriqueLaboratoire, FabriquePersonnel;

    public static TypeGroupe getGroupe(String groupe) {
        for (TypeGroupe typeGroupe : TypeGroupe.values()) {
            if (typeGroupe.toString().equalsIgnoreCase(groupe)) {
                return typeGroupe;
            }
        }
        return FabriqueLaboratoire;
    }
}