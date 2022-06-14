package pe.edu.upc.brayanrodriguezrojas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.brayanrodriguezrojas.model.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;

}
