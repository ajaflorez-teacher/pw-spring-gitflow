package pe.edu.upc.juantorres.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.juantorres.business.crud.CourseService;
import pe.edu.upc.juantorres.model.entity.Course;
import pe.edu.upc.juantorres.model.repository.CourseRepository;


public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public JpaRepository<Course, String> getJpaRepository() {
		return courseRepository;
	}

	@Override
	public List<Course> findByName(String name) throws Exception {
		return courseRepository.findByName(name);
	}

}
