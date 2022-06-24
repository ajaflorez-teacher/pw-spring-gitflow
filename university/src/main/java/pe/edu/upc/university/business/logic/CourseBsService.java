package pe.edu.upc.university.business.logic;

import java.util.List;

import pe.edu.upc.university.model.entity.Course;

public interface CourseBsService {
	
	List<Course> findByTeacher(Integer id) throws Exception;
}
