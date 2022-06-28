package pe.edu.upc.university.business.logic;

import java.util.Optional;

import pe.edu.upc.university.model.entity.User;

public interface UserBsService {
	
	boolean existsByUsername(String username) throws Exception;
	Optional<User> register(User User) throws Exception;	
}
