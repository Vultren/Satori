/**
 * BaseRepository.java 
 *
 * Satori
 * @author Eric Walden
 * Created May 27, 2016 12:20:37 PM
 */
package com.satori.dashboard.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * The Interface BaseRepository.
 *
 * @param <T>
 *            the generic type
 * @param <ID>
 *            the generic type
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
	
	 /**
	 * Delete.
	 *
	 * @param deleted
	 *            the deleted
	 */
 	void delete(T deleted);
	 
	 /**
	 * Find all.
	 *
	 * @return the list
	 */
 	List<T> findAll();
	     
	 /**
	 * Find one.
	 *
	 * @param id
	 *            the id
	 * @return the optional
	 */
 	Optional<T> findOne(ID id);
	 
	 /**
	 * Save.
	 *
	 * @param persisted
	 *            the persisted
	 * @return the t
	 */
 	T save(T persisted);
	 
	 /**
	 * Count.
	 *
	 * @return the long
	 */
 	Long count();

	 /**
	 * Find all.
	 *
	 * @param sort
	 *            the sort
	 * @return the list
	 */
 	List<T> findAll(Sort sort);
	 
	 /**
	 * Find all.
	 *
	 * @param pageable
	 *            the pageable
	 * @return the page
	 */
 	Page<T> findAll(Pageable pageable);
	 
	 
}
