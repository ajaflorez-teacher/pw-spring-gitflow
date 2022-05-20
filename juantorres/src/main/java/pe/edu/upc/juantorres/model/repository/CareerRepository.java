package pe.edu.upc.juantorres.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.juantorres.model.entity.Career;


@Repository //este es como Named pero para spring
public interface CareerRepository extends JpaRepository<Career, String> {

}
