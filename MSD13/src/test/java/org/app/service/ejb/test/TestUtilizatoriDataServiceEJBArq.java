package org.app.service.ejb.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.logging.Logger;

import javax.ejb.EJB;

import org.app.service.ejb.UtilizatoriService;
import org.app.service.ejb.UtilizatoriServiceEJB;
import org.app.service.entities.Utilizatori;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(Arquillian.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestUtilizatoriDataServiceEJBArq {
	
	private static Logger logger = Logger.getLogger(TestUtilizatoriDataServiceEJBArq.class.getName());
	
	@EJB
	private static UtilizatoriService service;
	
	@Deployment
	public static Archive<?> createDeployment() {
		
		return ShrinkWrap
				.create(WebArchive.class, "MSD13.war")
				.addPackage(Utilizatori.class.getPackage())
				.addClass(UtilizatoriService.class)
				.addClass(UtilizatoriServiceEJB.class)
				.addAsResource("META-INF/persistence.xml")
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	}
/*
	@Test
	public void test1_GetMessage() {
		logger.info("DEBUG: Junit TESTING: getMessage ...");
		String response = service.getMessage();
		assertNotNull("Data Service failed!", response);
		logger.info("DEBUG: EJB Response ..." + response);
	}*/
	
	@Test
	public void test2_DeleteUtilizator() {
		logger.info("DEBUG: Junit TESTING: testDeleteUtilizator ...");
		Collection<Utilizatori> utilizatori = service.getUtilizatori();
		for (Utilizatori u: utilizatori)
			service.removeUtilizator(u);
		Collection<Utilizatori> utilizatoriAfterDelete = service.getUtilizatori();
		assertTrue("Fail to read Utilizatori!", utilizatoriAfterDelete.size() == 0);
	}
	
	@Test
	public void test3_AddUtilizator() {
		logger.info("DEBUG: Junit TESTING: testAddUtilizator ...");
		Integer utilizatoriToAdd = 3;
		for (int i=1; i <=utilizatoriToAdd; i++) {
			service.addUtilizator(new Utilizatori(100+i, "utilizator_" + (100+i),"email_utilizator_" + (100+i)));
		}
		Collection<Utilizatori> utilizatori = service.getUtilizatori();
		assertTrue("Fail to add Utilizator!", utilizatori.size() == utilizatoriToAdd);
	}
	
	@Test
	public void test4_GetUtilizatori() {
		logger.info("DEBUG: Junit TESTING: testGetUtilizator ...");
		Collection<Utilizatori> utilizatori = service.getUtilizatori();
		assertTrue("Fail to read Utilizatori!", utilizatori.size() > 0);
	}
}
