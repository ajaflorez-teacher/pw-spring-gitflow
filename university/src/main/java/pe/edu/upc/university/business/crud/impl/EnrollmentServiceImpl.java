package pe.edu.upc.university.business.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.university.business.crud.EnrollmentService;
import pe.edu.upc.university.model.entity.Enrollment;
import pe.edu.upc.university.model.entity.Student;
import pe.edu.upc.university.model.repository.EnrollmentRepository;
import pe.edu.upc.university.model.repository.StudentRepository;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public JpaRepository<Enrollment, Integer> getJpaRepository() {
		return this.enrollmentRepository;
	}

	@Override
	public List<Enrollment> findByStudent(Integer id) throws Exception {
		if (studentRepository.existsById(id)) {
			Optional<Student> optional = studentRepository.findById(id);
			return enrollmentRepository.findByStudent(optional.get());
		} else {
			return new ArrayList<Enrollment>();
		}		
	}

}
