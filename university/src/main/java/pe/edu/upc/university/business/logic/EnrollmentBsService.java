package pe.edu.upc.university.business.logic;

import java.util.List;

import pe.edu.upc.university.model.entity.Enrollment;

public interface EnrollmentBsService {
	List<Enrollment> findByCourse(String id) throws Exception;
}
