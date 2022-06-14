package pe.edu.upc.juantorres.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.juantorres.business.crud.EnrollmentService;
import pe.edu.upc.juantorres.model.entity.Enrollment;
import pe.edu.upc.juantorres.model.repository.EnrollmentRepository;

public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	@Override
	public JpaRepository<Enrollment, Integer> getJpaRepository() {
		return enrollmentRepository;
	}

}
