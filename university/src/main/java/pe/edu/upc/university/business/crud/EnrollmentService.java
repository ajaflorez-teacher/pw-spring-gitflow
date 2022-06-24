package pe.edu.upc.university.business.crud;

import java.util.List;

import pe.edu.upc.university.model.entity.Enrollment;

public interface EnrollmentService extends CrudService<Enrollment, Integer> {

	List<Enrollment> findByStudent(Integer id) throws Exception;
}
