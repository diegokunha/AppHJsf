package br.com.dksweb.apphjsf.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Ckasse de coneção dom o banco
public class HibernateUtil {

	public static EntityManagerFactory factory = null;

	static {
		init();
	}

	private static void init() {
		try {
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("apphjsf");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public static Object getObject(Object obj) {
		return factory.getPersistenceUnitUtil().getIdentifier(obj);
	}

}
