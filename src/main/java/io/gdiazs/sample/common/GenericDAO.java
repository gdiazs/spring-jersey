package io.gdiazs.sample.common;

import java.util.Collection;

public interface GenericDAO<I,E> {

	void save(E entity) throws DataAccessException;
	
	void update(E entity) throws DataAccessException;
	
	Collection<E> findAll() throws DataAccessException;
	
	E findOne(I id) throws DataAccessException;

}
