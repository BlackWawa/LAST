package service;

import java.util.List;

import dao.Dao;
import metier.Personne;

public class Service {

	Dao dao = new Dao();

	public void addPersonne(Personne p) {
		dao.addPersonne(p);
		System.out.println("services save ");

	}

	public void updatePersonne(Personne personne) {
		dao.updatePersonne(personne);
		System.out.println("services update");

	}

	public void removePersonne(int i) {
		dao.removePersonne(i);
		System.out.println("services remove");

	}

	public Personne findPersonne(int i) {
		System.out.println("services find");
		return dao.findPersonne(i);

	}

	public List<Personne> listPersonne() {
		System.out.println("List de personne");
		return dao.listPersonne();

	}

	public Service() {
	}

}
