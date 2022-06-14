package pe.edu.upc.juantorres.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.juantorres.model.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

}
