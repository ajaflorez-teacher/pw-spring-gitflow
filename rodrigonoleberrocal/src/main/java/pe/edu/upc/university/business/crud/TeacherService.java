package pe.edu.upc.university.business.crud;

import java.util.List;

import pe.edu.upc.university.model.entity.Teacher;

public interface TeacherService extends CrudService<Teacher, Integer> {
	List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;

}
