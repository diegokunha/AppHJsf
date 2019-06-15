package br.com.dksweb.apphjsf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.dksweb.apphjsf.util.HibernateUtil;

public class DaoGenericImplement<T> implements DaoGeneric<T> {

	@Override
	public void salvar(T entidade) {

		EntityManager entityManager = HibernateUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			entityManager.persist(entidade);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public T merge(T entidade) {

		EntityManager entityManager = HibernateUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		T retorno = null;

		try {
			entityTransaction.begin();
			retorno = entityManager.merge(entidade);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		return retorno;
	}

	public void exclui(T endidade) {

		EntityManager entityManager = HibernateUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			entityManager.remove(endidade);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void excluiPorId(T entidade) {

		EntityManager entityManager = HibernateUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			Object id = HibernateUtil.getObject(entidade);
			entityManager.createQuery("delete from " + entidade.getClass().getCanonicalName() + " where id = " + id)
					.executeUpdate();
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<T> getListEntity(Class<T> entidade) {

		EntityManager entityManager = HibernateUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		List<T> retorno = entityManager.createQuery("from " + entidade.getName()).getResultList();

		entityTransaction.commit();
		entityManager.close();

		return retorno;

	}


}
