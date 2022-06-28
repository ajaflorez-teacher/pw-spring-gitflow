package pe.edu.upc.university.business.logic.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pe.edu.upc.university.business.logic.UserBsService;
import pe.edu.upc.university.model.entity.Segment;
import pe.edu.upc.university.model.entity.User;
import pe.edu.upc.university.model.repository.UserRepository;

@Service
public class UserBsServiceImpl implements UserBsService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public boolean existsByUsername(String username) throws Exception {
		Optional<User> optional = userRepository.findByUsername(username);
		if (optional.isPresent()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Optional<User> register(User user) throws Exception {
		// Agregar los Authorities por defecto
		if (user.getSegment().equals(Segment.STUDENT)) {
			user.addAuthority("ROLE_STUDENT");
		} else if (user.getSegment().equals(Segment.TEACHER)) {
			user.addAuthority("ROLE_TEACHER");
		}			
		user.addAuthority("ACCESS_VIEW_MATRI");
		
		// Cifrar el password
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		user.setPassword(bcpe.encode(user.getPassword()));
		
		// Grabar el usuario			
		return Optional.of(userRepository.save(user)); 
	}

}
