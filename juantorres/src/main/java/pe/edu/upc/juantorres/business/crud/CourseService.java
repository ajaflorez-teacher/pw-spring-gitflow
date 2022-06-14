package pe.edu.upc.juantorres.business.crud;

import java.util.List;

import pe.edu.upc.juantorres.model.entity.Course;

public interface CourseService extends CrudService<Course, String> {
	List<Course> findByName(String name) throws Exception;
}
