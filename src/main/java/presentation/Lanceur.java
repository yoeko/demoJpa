package presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Formation;

public class Lanceur {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Formation formation = new Formation("JPA");
		
		em.persist(formation);
		
		tx.commit();
		
		em.close();
		emf.close();

	}

}
