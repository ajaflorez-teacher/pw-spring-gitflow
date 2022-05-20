package pe.edu.upc.sergiohuamancheng.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.sergiohuamancheng.model.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;
}
