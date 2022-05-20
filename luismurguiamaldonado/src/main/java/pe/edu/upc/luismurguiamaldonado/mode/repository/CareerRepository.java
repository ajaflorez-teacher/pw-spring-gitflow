package pe.edu.upc.luismurguiamaldonado.mode.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.luismurguiamaldonado.mode.entity.Career;


@Repository
public interface CareerRepository extends JpaRepository<Career, String> {

}