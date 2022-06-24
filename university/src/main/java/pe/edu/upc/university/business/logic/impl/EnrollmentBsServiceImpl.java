package pe.edu.upc.university.business.logic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.university.business.logic.EnrollmentBsService;
import pe.edu.upc.university.model.entity.Course;
import pe.edu.upc.university.model.entity.Enrollment;
import pe.edu.upc.university.model.repository.CourseRepository;
import pe.edu.upc.university.model.repository.EnrollmentRepository;

@Service
public class EnrollmentBsServiceImpl implements EnrollmentBsService {

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Enrollment> findByCourse(String id) throws Exception {
 
		if (courseRepository.existsById(id)) {
			Optional<Course> optional = courseRepository.findById(id);
			return enrollmentRepository.findByCourse(optional.get());
		} else {
			return new ArrayList<Enrollment>();
		}
	}

}
