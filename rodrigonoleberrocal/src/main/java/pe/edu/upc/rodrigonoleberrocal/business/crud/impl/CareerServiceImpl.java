package pe.edu.upc.rodrigonoleberrocal.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.rodrigonoleberrocal.business.crud.CareerService;
import pe.edu.upc.rodrigonoleberrocal.model.entity.Career;
import pe.edu.upc.rodrigonoleberrocal.model.repository.CareerRepository;


public class CareerServiceImpl implements CareerService {

	@Autowired
	private CareerRepository careerRepository;
	
	@Override
	public JpaRepository<Career, String> getJpaRepository() {
		return this.careerRepository;
	}

}
