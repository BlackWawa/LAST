package test;

import org.proxi.spring.model.Client;

import dao.Dao;

public class Test {

	public static void main(String[] args) {

		
		Dao dao = new Dao();
		
		Client client = new Client(3,"Erwan","FORTAS","06604","dfqsdfq","qdgqd",null,null);

				dao.addPersonne(client);
				
	}

}
