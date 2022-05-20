package pe.edu.upc.juantorres.business.crud.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.juantorres.business.crud.CareerService;
import pe.edu.upc.juantorres.model.entity.Career;
import pe.edu.upc.juantorres.model.repository.CareerRepository;


@Service //como este es un clase service, se coloca Service
public class CareerServiceImpl implements CareerService {

	@Autowired //Esto reemplaza al Inject para spring
	private CareerRepository careerRepository;
	
	@Override
	public JpaRepository<Career, String> getJpaRepository() {
		return this.careerRepository;
	}

}
