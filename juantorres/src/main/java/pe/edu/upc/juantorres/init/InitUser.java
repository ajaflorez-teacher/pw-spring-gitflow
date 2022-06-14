package pe.edu.upc.juantorres.init;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pe.edu.upc.juantorres.model.entity.Segment;
import pe.edu.upc.juantorres.model.entity.User;
import pe.edu.upc.juantorres.model.repository.UserRepository;

@Service
public class InitUser implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception { //esto sirve para que todo lo que este dentro de las llaves se ejecuta sin la necesidad de tener una interface
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		// ROLE_XXXXX
		// ACCESS_YYYYY
		
		// SIEMPRE DEBE DE ESTAR COMENTADO
		// SOLO SE DEBE DESBLOQUEAR CUANDO SE CREAN USUARIO
		/*User carlos = new User();
		carlos.setUsername("carlos");
		carlos.setPassword(bcpe.encode("carlos"));
		carlos.setSegment(Segment.STUDENT);
		carlos.setIdSegment(2);
		carlos.addAuthority("ROLE_STUDENT");
		carlos.addAuthority("ACCESS_VIEW_MATRI");
		carlos.addAuthority("ACCESS_EDIT_MATRI");
		userRepository.save(carlos);
		
		User maria = new User("maria", bcpe.encode("maria"), Segment.STUDENT,3);
		maria.addAuthority("ROLE_STUDENT");
		maria.addAuthority("ACCESS_VIEW_MATRI");
		userRepository.save(maria);
		
		User pedro = new User("pedro", bcpe.encode("pedro"), Segment.TEACHER,1);
		pedro.addAuthority("ROLE_TEACHER");
		pedro.addAuthority("ACCESS_VIEW_MATRI");
		userRepository.save(pedro);
		
		User admin = new User("admin", bcpe.encode("admin"), Segment.TEACHER,2);
		admin.addAuthority("ROLE_ADMINISTRATOR");
		admin.addAuthority("ACCESS_ALL");
		userRepository.save(admin);*/
				
	}

}