package com.gaspy.recipeproject.repositories;

import com.gaspy.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
