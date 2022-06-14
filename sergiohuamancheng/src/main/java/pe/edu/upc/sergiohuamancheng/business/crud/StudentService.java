package pe.edu.upc.sergiohuamancheng.business.crud;

import java.util.List;

import pe.edu.upc.sergiohuamancheng.model.entity.Student;

public interface StudentService extends CrudService<Student, Integer> {
	List<Student> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;
}
