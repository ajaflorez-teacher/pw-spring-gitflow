package pe.edu.upc.brayanrodriguezrojas.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.brayanrodriguezrojas.business.crud.EnrollmentService;
import pe.edu.upc.brayanrodriguezrojas.model.entity.Enrollment;
import pe.edu.upc.brayanrodriguezrojas.model.repository.EnrollmentRepository;

public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	@Override
	public JpaRepository<Enrollment, Integer> getJpaRepository() {
		return enrollmentRepository;
	}

}
