package com.gaspy.recipeproject.repositories;

import com.gaspy.recipeproject.model.Category;
import com.gaspy.recipeproject.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
