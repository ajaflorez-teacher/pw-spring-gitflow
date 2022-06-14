package pe.edu.upc.juantorres.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.juantorres.model.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

}