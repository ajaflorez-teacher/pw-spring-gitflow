package pe.edu.upc.university.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.university.model.entity.Course;
import pe.edu.upc.university.model.entity.Enrollment;
import pe.edu.upc.university.model.entity.Student;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

	List<Enrollment> findByStudent(Student student) throws Exception;
	List<Enrollment> findByCourse(Course course) throws Exception;
}
