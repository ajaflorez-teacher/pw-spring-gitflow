package pe.edu.upc.anthonyarenas.business.crud.impl;

import java.io.Serializable;
import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.anthonyarenas.business.crud.PublicationsServices;

import pe.edu.upc.anthonyarenas.model.entity.Publications;
import pe.edu.upc.anthonyarenas.model.repository.PublicationsRepository;

@Service
public class PublicationsServiceImpl implements PublicationsServices, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private  PublicationsRepository publicationsRepository;
	
	@Override
	public JpaRepository<Publications, Integer> getJpaRepository() {
		return this.publicationsRepository;
	}
	
	@Transactional
	@Override
	public Publications update(Publications entity) throws Exception {
		return publicationsRepository.save(entity);
	}
	
}
