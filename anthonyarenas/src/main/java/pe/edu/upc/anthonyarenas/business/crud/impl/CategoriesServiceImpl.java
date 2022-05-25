package pe.edu.upc.anthonyarenas.business.crud.impl;

import java.io.Serializable;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.anthonyarenas.business.crud.CategoriesService;
import pe.edu.upc.anthonyarenas.model.entity.Categories;
import pe.edu.upc.anthonyarenas.model.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private  CategoriesRepository categoriesRepository;
	
	@Override
	public JpaRepository<Categories, Integer> getJpaRepository() {
		return this.categoriesRepository;
	}
	

	@Transactional
	@Override
	public Categories update(Categories entity) throws Exception {
		return categoriesRepository.save(entity);
	}

}
