package com.gaspy.recipeproject.services;

import com.gaspy.recipeproject.model.Recipe;
import com.gaspy.recipeproject.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes() {
        return (List)recipeRepository.findAll();
    }
}
