package pe.edu.upc.brayanrodriguezrojas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.brayanrodriguezrojas.model.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
	List<Course> findByName(String name) throws Exception;
}
