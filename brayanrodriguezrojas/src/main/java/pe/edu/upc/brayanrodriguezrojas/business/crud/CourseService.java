package pe.edu.upc.brayanrodriguezrojas.business.crud;

import java.util.List;

import pe.edu.upc.brayanrodriguezrojas.model.entity.Course;

public interface CourseService extends CrudService<Course, String> {
	List<Course> findByName(String name) throws Exception;
}
