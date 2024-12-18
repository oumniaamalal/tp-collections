package colllection;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // Création de quelques objets Commande
        Commandee cmd1 = new Commandee(1, new Date(), "Fournisseur1");
        Commandee cmd2 = new Commandee(2, new Date(), "Fournisseur2");

        // Création d'un Client
        Client client1 = new Client("C001", "Client 1", "Adresse 1");
        client1.enregistrerCommande(cmd1);
        client1.enregistrerCommande(cmd2);

        // Création d'un ClientFidel
        ClientFidel clientFidel = new ClientFidel("C002", "Client 2", "Adresse 2", "F123", 0.1f);

        // Liste des clients
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(clientFidel);

        // Tri des commandes du client1 par date
        Collections.sort(client1.getListeCommandes());

        // Création d'un Set pour éviter les doublons dans les commandes
        Set<Commandee> commandes = new HashSet<>(client1.getListeCommandes());

        // Utilisation d'une Map avec CodeClient comme clé
        Map<String, Client> mapClients = new HashMap<>();
        mapClients.put(client1.getCodeClient(), client1); // Utiliser CodeClient comme clé

        // Écriture des clients dans un fichier texte
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clients.txt"))) {
            for (Client client : clients) {
                writer.write
                (client.toString());
                writer.newLine(); // Ajout d'un retour à la ligne entre chaque client
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
        }

        // Lecture du fichier et affichage des informations des clients
        try (BufferedReader reader = new BufferedReader(new FileReader("clients.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }
    }
}
