package pe.edu.upc.anthonyarenas.business.crud.impl;

import java.io.Serializable;
import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.anthonyarenas.business.crud.UsersService;

import pe.edu.upc.anthonyarenas.model.entity.Users;
import pe.edu.upc.anthonyarenas.model.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private  UsersRepository usersRepository;
	
	@Override
	public JpaRepository<Users, Integer> getJpaRepository() {
		return this.usersRepository;
	}
	
	@Transactional
	@Override
	public Users update(Users entity) throws Exception {
		return usersRepository.save(entity);
	}
	
}
