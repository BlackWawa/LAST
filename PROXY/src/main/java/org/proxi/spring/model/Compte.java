package org.proxi.spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@ManagedBean
@Entity
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected int numCompte;
	private String typeCompte;
	protected double solde;
	@ManyToOne
	protected Client client;

	public Compte(int id, int numCompte, String typeCompte, double solde, Client client) {
		super();
		this.id = id;
		this.numCompte = numCompte;
		this.typeCompte = typeCompte;
		this.solde = solde;
		this.client = client;
	}

	public Compte() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numCompte=" + numCompte + ", typeCompte=" + typeCompte + ", solde=" + solde
				+ ", client=" + client + "]";
	}

}
