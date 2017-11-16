package org.app.service.ejb;


import java.util.Collection;

import javax.ejb.Remote;
import javax.ws.rs.core.Feature;

import org.app.service.entities.Utilizatori;

@Remote
public interface UtilizatoriService {

	Utilizatori addUtilizator(Utilizatori utilizatorToAdd);
	
	String removeUtilizator(Utilizatori utilizatorToDelete);
	
	Utilizatori getUtilizatorByIdUtilizator(Integer IDUtilizator);
	Collection<Utilizatori> getUtilizatori();
	
	Utilizatori getUtilizatorByName(String NumePrenume);
	
	String sayRest();
}
