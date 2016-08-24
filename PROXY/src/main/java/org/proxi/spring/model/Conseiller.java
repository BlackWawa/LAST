package org.proxi.spring.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author adminl bean Conseiller
 *
 */
@ManagedBean
@Entity
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prenom;
	private String nom;
	private String login;
	private String mdp;
	private int hierarchie;
	private List<Client> Clients;

	public Conseiller() {
		super();
	}

	public Conseiller(int id, String prenom, String nom, String login, String mdp, int hierarchie,
			List<Client> clients) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.mdp = mdp;
		this.hierarchie = hierarchie;
		Clients = clients;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getHierarchie() {
		return hierarchie;
	}

	public void setHierarchie(int hierarchie) {
		this.hierarchie = hierarchie;
	}

	public List<Client> getClients() {
		return Clients;
	}

	public void setClients(List<Client> clients) {
		Clients = clients;
	}

	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", login=" + login + ", mdp=" + mdp
				+ ", hierarchie=" + hierarchie + ", Clients=" + Clients + "]";
	}

}