package org.proxi.spring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.proxi.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ManagedBean
@RequestScoped
@Component
public class ControllerAuthentification {

	 @Autowired
	 private Conseiller conseiller = new Conseiller();

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public String connexion() {
		System.out.println(conseiller.toString());
		return "xAcceuilConseiller";

	}

}
