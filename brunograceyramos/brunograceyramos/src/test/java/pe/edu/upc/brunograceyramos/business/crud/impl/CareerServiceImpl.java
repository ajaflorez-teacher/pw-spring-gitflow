package pe.edu.upc.brunograceyramos.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.brunograceyramos.business.crud.CareerService;
import pe.edu.upc.brunograceyramos.model.entity.Career;
import pe.edu.upc.brunograceyramos.model.repository.CareerRepository;


@Service
public class CareerServiceImpl implements CareerService {

	@Autowired
	private CareerRepository careerRepository;
	
	@Override
	public JpaRepository<Career, String> getJpaRepository() {
		return this.careerRepository;
	}

}
