package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;



@Remote
public interface DataService extends EntityRepository<EntityBase>{

	String sayRest();

}