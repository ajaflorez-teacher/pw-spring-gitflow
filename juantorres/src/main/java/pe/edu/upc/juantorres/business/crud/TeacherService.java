package pe.edu.upc.juantorres.business.crud;

import java.util.List;

import pe.edu.upc.juantorres.model.entity.Teacher;

public interface TeacherService extends CrudService<Teacher, Integer> {
	List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;
}
