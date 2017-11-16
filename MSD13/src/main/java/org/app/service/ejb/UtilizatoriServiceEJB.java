package org.app.service.ejb;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.app.service.entities.Utilizatori;



@Stateless @LocalBean

public class UtilizatoriServiceEJB implements UtilizatoriService{

	private static Logger logger = Logger.getLogger(UtilizatoriServiceEJB.class.getName());
	
	@PersistenceContext(unitName="MSD13")
	private EntityManager em;
	
	public UtilizatoriServiceEJB() {
		
	}
	
	@PostConstruct
	public void init() {
		logger.info("POSTCONSTRUCT-INIT: " + this.em);
	}

	@Override
	public Utilizatori addUtilizator(Utilizatori utilizatorToAdd) {
		em.persist(utilizatorToAdd);
		em.flush();
		em.refresh(utilizatorToAdd);
		return utilizatorToAdd;
	}
	
	@Override
	public Utilizatori getUtilizatorByIdUtilizator(Integer IdUtilizator) {
		return em.find(Utilizatori.class, IdUtilizator);
	}
	
	public Collection<Utilizatori> getUtilizatori() {
		
		List<Utilizatori> utilizatori = em.createQuery("SELECT u FROM Utilizatori u", Utilizatori.class).getResultList();
		return utilizatori;
	}
	
	public String removeUtilizator (Utilizatori utilizatorToDelete) {
		
		utilizatorToDelete = em.merge(utilizatorToDelete);
		em.remove(utilizatorToDelete);
		em.flush();
		return "True";
		
	}
	
	@Override
	public Utilizatori getUtilizatorByName(String NumePrenume) {
		return em.createQuery("SELECT u FROM Utilizatori u WHERE u.NumePrenume = :NumePrenume", Utilizatori.class).setParameter("NumePrenume", NumePrenume).getSingleResult();
	}
	
	public String sayRest() {
		return "UtilizatoriService is on...";
	}
}