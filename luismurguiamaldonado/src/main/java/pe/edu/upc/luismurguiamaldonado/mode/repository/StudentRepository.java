package pe.edu.upc.luismurguiamaldonado.mode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.luismurguiamaldonado.mode.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;
}
