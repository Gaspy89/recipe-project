package com.gaspy.recipeproject.services;

import com.gaspy.recipeproject.model.Recipe;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> getRecipes();
    public Recipe findById(Long id);
}
