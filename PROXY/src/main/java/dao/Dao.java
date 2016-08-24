package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.proxi.spring.model.Client;

import metier.Personne;

public class Dao {
	
	//Ajouter Singleton

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque");
	EntityManager em = emf.createEntityManager();

	public Client addPersonne(Client p) {

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("dao save " + p);

		return p;

	}

	public Personne updatePersonne(Personne personne) {
		em.getTransaction().begin();
		int i = personne.getId();
		Personne p = em.find(Personne.class, i);
		em.persist(personne);
		em.getTransaction().commit();
		System.out.println("dao update " + p);
		return p;
	}

	public Personne removePersonne(int i) {
		em.getTransaction().begin();
		Personne p = em.find(Personne.class, i);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("dao remove " + p);
		return p;

	}

	public Personne findPersonne(int i) {
		em.getTransaction().begin();
		Personne p = em.find(Personne.class, i);
		em.getTransaction().commit();
		System.out.println("dao find " + p);
		return p;

	}

	@SuppressWarnings("unchecked")
	public List<Personne> listPersonne() {
		List<Personne> listePersonnes = new ArrayList<>();
		em.getTransaction().begin();
		Query qpersonnes = em.createQuery("SELECT c FROM Personne c");
		listePersonnes.addAll(qpersonnes.getResultList());
		em.getTransaction().commit();
		return listePersonnes;
	}

	public Dao() {
	}

}