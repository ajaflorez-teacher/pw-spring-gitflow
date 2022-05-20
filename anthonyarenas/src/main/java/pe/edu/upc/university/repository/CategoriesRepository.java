package pe.edu.upc.university.repository;

import java.util.List;

import pe.edu.upc.university.model.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
	List<Categories> findByName(String Name) throws Exception;
}
