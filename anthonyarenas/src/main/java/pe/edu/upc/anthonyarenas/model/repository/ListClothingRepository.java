package pe.edu.upc.anthonyarenas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.anthonyarenas.model.entity.ListClothing;

@Repository
public interface ListClothingRepository extends JpaRepository<ListClothing, Integer> {
}
