package pe.edu.upc.university.business.crud;

import java.util.List;

import pe.edu.upc.university.model.entity.Course;

public interface CourseService extends CrudService<Course, String> {
	List<Course> findByName(String name) throws Exception;
}
