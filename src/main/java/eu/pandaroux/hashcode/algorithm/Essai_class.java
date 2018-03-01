package eu.pandaroux.hashcode.algorithm;

public class Essai_class {

    private String onStockDansLaClasse;
    private int iciAussi;

    public Essai_class(String ceciEstUneVariable, int ceciEstUneAutreVariable)
    {
        onStockDansLaClasse = ceciEstUneVariable;
        iciAussi = ceciEstUneAutreVariable;
    }

    public String getLaChaine() {
        return onStockDansLaClasse;
    }

    public int getLeNombre() {
        return iciAussi;
    }

    public void setLaChaine(String onStockDansLaClasse) {
        this.onStockDansLaClasse = onStockDansLaClasse;
    }

    public void setLeNombre(int iciAussi) {
        this.iciAussi = iciAussi;
    }
}
