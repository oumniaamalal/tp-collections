package colllection;
import java.util.List;
import java.util.ArrayList;

public class Client {
    private String CodeClient; // Code du client
    private String NomClient;  // Nom du client
    private String AdrClient;  // Adresse du client
    private String TelClient;  // Téléphone du client
    private ArrayList<Commandee> ListeCommandes; // Liste des commandes passées par le client
    
    // Constructeur de la classe Client
    public Client(String CodeClient, String NomClient, String AdrClient) {
        this.CodeClient = CodeClient;
        this.NomClient = NomClient;
        this.AdrClient = AdrClient;
        this.ListeCommandes = new ArrayList<Commandee>(); // Initialisation de la liste des commandes
    }

    // Méthode pour enregistrer une commande dans la liste
    public boolean enregistrerCommande(Commandee cmd) {
        return ListeCommandes.add(cmd); // Ajoute la commande à la liste et retourne le résultat
    }

    // Méthode pour supprimer une commande par numéro de commande
    public boolean supprimerCommande(int NumCommande) {
        for (Commandee cmd : ListeCommandes) {
            if (cmd.getNumcommande() == NumCommande) {
                ListeCommandes.remove(cmd); // Supprime la commande si le numéro correspond
                return true; 
            }
        }
        return false; // Retourne false si la commande n'a pas été trouvée
    }

    // Méthode toString pour afficher les informations du client et ses commandes
    @Override
    public String toString() {
        return "Client{" +
                "CodeClient='" + CodeClient + '\'' +
                ", NomClient='" + NomClient + '\'' +
                ", AdrClient='" + AdrClient + '\'' +
                ", ListeCommandes=" + ListeCommandes +
                '}';
    }

    // Accesseurs (getters) pour les attributs
    public String getCodeClient() {
        return CodeClient;
    }

    public String getNomClient() {
        return NomClient;
    }

    public String getAdrClient() {
        return AdrClient;
    }

    public String getTelClient() {
        return TelClient;
    }

    // Retourne la liste des commandes du client
    public List<Commandee> getListeCommandes() {
        return ListeCommandes;
    }
    
    // Mutateur (setter) pour modifier l'attribut TelClient
    public void setTelClient(String telClient) {
        this.TelClient = telClient;
    }
}
