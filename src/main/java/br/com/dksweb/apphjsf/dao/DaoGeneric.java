package br.com.dksweb.apphjsf.dao;

import java.util.List;

public interface DaoGeneric<T> {

	public void salvar(T entity);
	
	public T merge(T entidade);
	
	public void exclui(T entity);
	
	public void excluiPorId(T entidade);
	
	public List<T> getListEntity(Class<T> entidade);
		
	
}
