package pe.edu.upc.brayanrodriguezrojas.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.brayanrodriguezrojas.business.crud.CourseService;
import pe.edu.upc.brayanrodriguezrojas.model.entity.Course;
import pe.edu.upc.brayanrodriguezrojas.model.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public JpaRepository<Course, String> getJpaRepository() {
		return null;
	}

	@Override
	public List<Course> findByName(String name) throws Exception {
		return courseRepository.findByName(name);
	}

}
