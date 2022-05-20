package pe.edu.upc.luismurguiamaldonado.business.crud;

import java.util.List;

import pe.edu.upc.luismurguiamaldonado.mode.entity.Student;



public interface StudentService extends CrudService<Student, Integer> {
	List<Student> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;
}
