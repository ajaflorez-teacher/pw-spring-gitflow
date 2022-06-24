package pe.edu.upc.university.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.university.model.entity.Course;
import pe.edu.upc.university.model.entity.Teacher;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
	List<Course> findByName(String name) throws Exception;
	List<Course> findByTeacher(Teacher teacher) throws Exception;
}
