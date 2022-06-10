package pe.edu.upc.brayanrodriguezrojas.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pe.edu.upc.brayanrodriguezrojas.model.entity.User;
import pe.edu.upc.brayanrodriguezrojas.model.repository.UserRepository;

@Service
public class InitUser implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		// ROLE_XXXXX
		// ACCESS_YYYYY
		
		// SIEMPRE DEBE DE ESTAR COMENTADO
		// SOLO SE DEBE DESBLOQUEAR CUANDO SE CREAN USUARIO
		/*User carlos = new User();
		carlos.setUsername("carlos");
		carlos.setPassword(bcpe.encode("carlos"));		
		carlos.addAuthority("ROLE_STUDENT");
		carlos.addAuthority("ACCESS_VIEW_MATRI");
		carlos.addAuthority("ACCESS_EDIT_MATRI");
		userRepository.save(carlos);
		
		User maria = new User("maria", bcpe.encode("maria"));
		maria.addAuthority("ROLE_STUDENT");
		carlos.addAuthority("ACCESS_VIEW_MATRI");
		userRepository.save(maria);
		
		User admin = new User("admin", bcpe.encode("admin"));
		admin.addAuthority("ROLE_ADMINISTRATOR");
		admin.addAuthority("ACCESS_ALL");
		userRepository.save(admin);*/
				
	}

}
