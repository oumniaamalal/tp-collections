package colllection;

public class ClientFidel extends Client {
    private String CodeFidelite;
    private float TauxReduction;

    // Constructeur d'initialisation
    public ClientFidel(String CodeClient, String NomClient, String AdrClient, String CodeFidelite, float TauxReduction) {
        // Appel au constructeur de la classe parent (Client)
        super(CodeClient, NomClient, AdrClient);
        this.CodeFidelite = CodeFidelite;
        this.TauxReduction = TauxReduction;
    }

    // Méthode toString redéfinie pour afficher les informations du client fidèle
    @Override
    public String toString() {
        return super.toString() + // Appel à la méthode toString de la classe parent Client
                ", CodeFidelite='" + CodeFidelite + '\'' +
                ", TauxReduction=" + TauxReduction;
    }

    // Getters et Setters (optionnels, si vous souhaitez les ajouter)
    public String getCodeFidelite() {
        return CodeFidelite;
    }

    public void setCodeFidelite(String codeFidelite) {
        CodeFidelite = codeFidelite;
    }

    public float getTauxReduction() {
        return TauxReduction;
    }

    public void setTauxReduction(float tauxReduction) {
        TauxReduction = tauxReduction;
    }
}
