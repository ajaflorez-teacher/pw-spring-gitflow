package pe.edu.upc.brayanrodriguezrojas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.brayanrodriguezrojas.model.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

}
