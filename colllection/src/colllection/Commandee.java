package colllection;

import java.util.Date;

public class Commandee implements Comparable<Commandee>{
	private int numcommande;
	private Date datecommande;
	private String nomfournisseur;
	
	public Commandee (int numcommande,Date datecommande,String nomfournisseur) {
		this.numcommande=numcommande;
		this.datecommande=datecommande;
		this.nomfournisseur=nomfournisseur;		
	}
	public int getNumcommande() {
		return numcommande;
	}
	public Date getDatecommande() {
		return datecommande;
	}
	public String getNomfournisseur() {
		return nomfournisseur;
	}
	public void setNumcommande(int numcommande) {
		this.numcommande=numcommande;
	}
	public void setDatecommande (Date datecommande) {
		this.datecommande=datecommande;
		
	}
	public void setNomfournisseur (String nomfournisseur) {
		this.nomfournisseur=nomfournisseur;	
		
	}
	public String toString() {
		return 
				 "Commande{" +"NumCommande=" + numcommande +
                ", DateCommande=" + datecommande +
                ", NomFournisseur='" + nomfournisseur+ '\'' +
                '}';
		
		
	}
	public boolean equals (Object obj) {
		if (this==obj)
			return true;
		if (obj==null || getClass()!= obj.getClass())
			return false;
		Commandee commande =(Commandee)obj;
		return numcommande == commande.numcommande;
				
					
	}
	@Override
	public int compareTo(Commandee cmd) {
	

		return this.datecommande.compareTo(cmd.datecommande);
	}

	
	

}
