package org.proxi.spring.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author adminl bean historique operation sur les compte
 *
 */
@ManagedBean

@Entity
public class OperationCompte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Compte idCompte1;
	@OneToOne
	private Compte idCompte2;
	private Double montant;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOperation;

	public OperationCompte() {
		super();
	}

	public OperationCompte(int id, Compte idCompte1, Compte idCompte2, Double montant, Date dateOperation) {
		super();
		this.id = id;
		this.idCompte1 = idCompte1;
		this.idCompte2 = idCompte2;
		this.montant = montant;
		this.dateOperation = dateOperation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Compte getIdCompte1() {
		return idCompte1;
	}

	public void setIdCompte1(Compte idCompte1) {
		this.idCompte1 = idCompte1;
	}

	public Compte getIdCompte2() {
		return idCompte2;
	}

	public void setIdCompte2(Compte idCompte2) {
		this.idCompte2 = idCompte2;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	@Override
	public String toString() {
		return "OperationCompte [id=" + id + ", idCompte1=" + idCompte1 + ", idCompte2=" + idCompte2 + ", montant="
				+ montant + ", dateOperation=" + dateOperation + "]";
	}

}
