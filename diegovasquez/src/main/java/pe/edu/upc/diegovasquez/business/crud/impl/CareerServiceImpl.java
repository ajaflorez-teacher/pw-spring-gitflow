package pe.edu.upc.diegovasquez.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.diegovasquez.business.crud.CareerService;
import pe.edu.upc.diegovasquez.model.entity.Career;
import pe.edu.upc.diegovasquez.model.repository.CareerRepository;


@Service
public class CareerServiceImpl implements CareerService {

	@Autowired
	private CareerRepository careerRepository;
	
	@Override
	public JpaRepository<Career, String> getJpaRepository() {
		return this.careerRepository;
	}

}
