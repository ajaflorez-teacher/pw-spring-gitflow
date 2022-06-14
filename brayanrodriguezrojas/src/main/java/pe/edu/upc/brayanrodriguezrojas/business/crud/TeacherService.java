package pe.edu.upc.brayanrodriguezrojas.business.crud;

import java.util.List;

import pe.edu.upc.brayanrodriguezrojas.model.entity.Teacher;

public interface TeacherService extends CrudService<Teacher, Integer> {
	List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;

}
