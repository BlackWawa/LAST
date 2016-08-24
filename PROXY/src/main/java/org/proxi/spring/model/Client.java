package org.proxi.spring.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author adminl bean customer
 *
 */
@Entity
@ManagedBean
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prenom;
	private String nom;
	private String adresse;
	private String mail;
	private String telephone;
	@ManyToOne
	private Conseiller conseiller;
	@OneToMany
	List<Compte> comptes;

	public Client() {
		super();
	}

	public Client(int id, String prenom, String nom, String adresse, String mail, String telephone,
			Conseiller conseiller, List<Compte> comptes) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
		this.conseiller = conseiller;
		this.comptes = comptes;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", mail=" + mail
				+ ", telephone=" + telephone + ", conseiller=" + conseiller + ", comptes=" + comptes + "]";
	}

}
