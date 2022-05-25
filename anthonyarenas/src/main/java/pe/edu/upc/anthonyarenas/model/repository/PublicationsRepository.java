package pe.edu.upc.anthonyarenas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.anthonyarenas.model.entity.Publications;

@Repository
public interface PublicationsRepository extends JpaRepository<Publications, Integer> {
}
