package pe.edu.upc.rodrigonoleberrocal.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.rodrigonoleberrocal.model.entity.Career;
@Repository
public interface CareerRepository extends JpaRepository<Career, String> {

}
